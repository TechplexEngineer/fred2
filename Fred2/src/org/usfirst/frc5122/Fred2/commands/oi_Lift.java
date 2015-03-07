// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5122.Fred2.commands;

import org.usfirst.frc5122.Fred2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class  oi_Lift extends Command {
	
	private final double DEADBAND = .05;
	private final double FACTOR_DOWN = .65;
	private final double FACTOR_UP = .85;
	
	private final double lift_kp = -0.03;
	private boolean STATE_HOLD = false;

    public oi_Lift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.lift);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("EXE");
    	if ((Robot.oi.getXbox().getRightTrigger() > DEADBAND)) {
    		Robot.lift.moveLift(-Robot.oi.getXbox().getRightTrigger()*FACTOR_DOWN);
    		STATE_HOLD = false;
    	} 
    	else if ((Robot.oi.getXbox().getLeftTrigger() > DEADBAND)) {
    		Robot.lift.moveLift(Robot.oi.getXbox().getLeftTrigger()*FACTOR_UP);
    		STATE_HOLD = false;
    	}
    	else if (Robot.oi.getXbox().isRB()) {
    		Robot.lift.moveLift(-1*FACTOR_DOWN);
    		STATE_HOLD = false;
    	}
    	else if (Robot.oi.getXbox().isLB()) {
    		Robot.lift.moveLift(1*FACTOR_UP);
    		STATE_HOLD = false;
    	}
    	else 
    	{
    		if (! STATE_HOLD) {
    			Robot.lift.reset();
    			STATE_HOLD = true;
    		} else {
    			double error = Robot.lift.getDistance();
    			if (Math.abs(error) > 1) {
    				Robot.lift.moveLift(error * lift_kp);
    				System.out.println(error * lift_kp);
    			} else {
    				Robot.lift.moveLift(0);
    			}
    		}
    	}
    	System.out.println(STATE_HOLD);
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lift.moveLift(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
