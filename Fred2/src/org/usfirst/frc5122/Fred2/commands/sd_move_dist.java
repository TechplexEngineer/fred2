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
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class  sd_move_dist extends Command {
    public sd_move_dist() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drive);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        SmartDashboard.putNumber("Drive Speed", .8);
        SmartDashboard.putNumber("DriveDistance", 0);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	double dist = SmartDashboard.getNumber("DriveDistance");
    	double distSpeed = SmartDashboard.getNumber("Drive Speed");
    	a_drive_move_dist moveDrive = new a_drive_move_dist(dist, distSpeed);
    	moveDrive.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
