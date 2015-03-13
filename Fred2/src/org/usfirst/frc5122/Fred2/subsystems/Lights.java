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
import org.usfirst.frc5122.Fred2.U;
import org.usfirst.frc5122.Fred2.commands.*;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Lights extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	private I2C lightController = new I2C(I2C.Port.kOnboard, 4);
	public LightGroup LightBar;
	public LightGroup LiftLights;
	public Lights()
	{
//		LightBar = new LightGroup(0,1,2);
//		LiftLights = new LightGroup(3,4,5);
		
		LiftLights = new LightGroup(0,1,2);
		LightBar = new LightGroup(3,4,5);
	}

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void setRaw(int chan, int duty) {
    	chan = U.constrain(0, chan, 5);
    	duty = U.constrain(0, duty, 15);
    	chan = (chan << 4) & 0x70;
    	duty = duty & 0x0F;
    	lightController.write(0, chan|duty);
    }
    
    public class LightGroup  
    {
    	private int redChan, blueChan, greenChan;
    	public LightGroup(int redChan, int greenChan, int blueChan) 
    	{
    		this.redChan = redChan;
    		this.blueChan = blueChan;
    		this.greenChan = greenChan;
    		
    	}
    	// red, blue, green are on the range 0-15
    	public void set(int red, int green, int blue) {
    		setRaw(redChan, red);
    		setRaw(blueChan, blue);
    		setRaw(greenChan, green);
    	}
    }
    
    
}
