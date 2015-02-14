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
public class Lift extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController lift = RobotMap.liftLift;
    DigitalInput topLimit = RobotMap.liftTopLimit;
    DigitalInput bottomLimit = RobotMap.liftBottomLimit;
    SpeedController liftCim = RobotMap.liftLiftCim;
    Encoder liftEncoder = RobotMap.liftLiftEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new oi_Lift());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    }
    public void moveLift(double speed) {
    	if(topLimit.get()) {
    		//only go down
    		if(speed < 0) {
    			go(speed);
    		} else {
    			go(0);
    		}
    	} else if(bottomLimit.get()) {
    		//only go up
    		if(speed > 0) {
    			go(speed);
    		} else {
    			go(0);
    		}
    	} else {
    		go(speed);
    	}
    }
    //UNSAFE METHOD, DOES NOT CHECK LIMIT SWITCHES!
    private void go(double speed) {
//    	lift.set(speed);
    	liftCim.set(speed);
    }
    public void stop() {
    	moveLift(0);
    }
    
    public boolean isAtTop() {
    	return topLimit.get();
    }
    public boolean isAtBottom() {
    	return bottomLimit.get();
    }
    public double getDistance() {
    	return liftEncoder.getDistance();
    }
}

