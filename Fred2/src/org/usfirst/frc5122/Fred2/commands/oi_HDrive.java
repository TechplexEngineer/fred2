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

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc5122.Fred2.Robot;

/**
 *
 */
public class  oi_HDrive extends Command {

    public oi_HDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drive);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.resetGyro();
    }
    private double map(double old_value, double old_top, double old_bottom, double new_top, double new_bottom) {
    	return (old_value - old_bottom) / (old_top - old_bottom) * (new_top - new_bottom) + new_bottom;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double throttle = Robot.oi.getDriver().getThrottle();
    	
    	throttle = map(throttle, -1, 1, 1, .25);
    	double factor = throttle*.8;
    	double drive = Robot.oi.getDriver().getY()*factor;
    	double turn = Robot.oi.getDriver().getZ()*factor;
    	double slide = Robot.oi.getDriver().getX()*factor;
    	
//    	SmartDashboard.putNumber("JS",	drive);
    	Robot.drive.hDrive(drive, turn, slide);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
