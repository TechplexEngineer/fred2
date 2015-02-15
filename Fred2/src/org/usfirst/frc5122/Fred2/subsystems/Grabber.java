// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5122.Fred2.subsystems;

import org.usfirst.frc5122.Fred2.RobotMap;
import org.usfirst.frc5122.Fred2.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Grabber extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Solenoid light = RobotMap.grabberLight;
    Solenoid toteGripper = RobotMap.grabberToteGripper;
    DoubleSolenoid pusher = RobotMap.grabberPusher;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void grab(boolean grab) {
    	toteGripper.set(grab);
    }
    public void grab() {
    	grab(false);
    }
    public void ungrab() {
    	grab(true);
    }
    public void push(boolean push) {
    	if (push) {
    		pusher.set(DoubleSolenoid.Value.kForward);
    	} else {
    		pusher.set(DoubleSolenoid.Value.kReverse);
    	}
    }
    public void push() {
    	push(true);
    }
    public void unpush() {
    	push(false);
    }
    
    
    
    public void light(boolean on){
    	light.set(on);
    }
   
}

