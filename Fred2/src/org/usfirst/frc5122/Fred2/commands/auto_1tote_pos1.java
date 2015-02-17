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
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class auto_1tote_pos1 extends CommandGroup {
    
    public  auto_1tote_pos1() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	double turnspeed = .8;
    	double driveSpeed = .8;
    	double liftSpeed = .8;
    	
    	addParallel(new a_lift_move_dist(3, liftSpeed)); //lift up
    	addSequential(new a_drive_turn_angle(90, turnspeed), 2);
    	addSequential(new a_drive_move_dist(113, driveSpeed), 3.5);
    	addSequential(new a_drive_turn_angle(90, turnspeed), 2);
    	addSequential(new a_drive_move_dist(41, driveSpeed), 2);
    	addSequential(new a_lift_bottom());
    	addSequential(new a_drive_turn_angle(15, turnspeed), 2);
    	addSequential(new a_drive_move_dist(-90, driveSpeed), 4);

    }
}