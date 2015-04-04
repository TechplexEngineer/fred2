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
public class  a_drive_turn_lisa extends Command {

    public a_drive_turn_lisa() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drive);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.resetLeftDistance();
//    	System.out.println("Staring Lisa's Code");
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.HDrive(0, .9, 0);
    	System.out.println("EXE");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
//    	System.out.println(" "+Robot.drive.leftEnc.get()+" "+(Robot.drive.leftEnc.get() >= 1050));
        return Robot.drive.leftEnc.get() >= 705;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.stop();
//    	System.out.println("DONE");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	System.out.println("INT");
    	end();
    }
}
