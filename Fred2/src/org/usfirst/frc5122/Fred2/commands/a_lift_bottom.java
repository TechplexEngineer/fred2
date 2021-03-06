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
public class  a_lift_bottom extends Command {

	private double speed;
    public a_lift_bottom(double speed) {
    	this.speed = Math.abs(speed);
    	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.lift);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
    }
    public a_lift_bottom() {
    	this(.65);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("INIT a_lift_bottom");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.lift.moveLift(-1);
    	System.out.println("EXEC a_lift_bottom");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	boolean done = Robot.lift.isAtBottom();
    	System.out.println("IsFini "+done);
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
