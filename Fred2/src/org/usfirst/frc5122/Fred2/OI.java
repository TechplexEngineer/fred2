// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5122.Fred2;

import org.usfirst.frc5122.Fred2.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton containerUprighter;
    public JoystickButton stabilizer;
    public Joystick driver;
    public Joystick aux;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Xbox xbox;

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        aux = new Joystick(1);
        
        driver = new Joystick(0);
        
        stabilizer = new JoystickButton(driver, 4);
        stabilizer.whenPressed(new oi_Stabilizer());
        containerUprighter = new JoystickButton(driver, 3);
        containerUprighter.whenPressed(new oi_containerUprighter());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("oi_HDrive", new oi_HDrive());

        SmartDashboard.putData("auto_3totes", new auto_3totes());

        SmartDashboard.putData("a_lift_top", new a_lift_top());

        SmartDashboard.putData("a_lift_bottom", new a_lift_bottom());

        SmartDashboard.putData("a_grabber_ungrab", new a_grabber_ungrab());

        SmartDashboard.putData("a_grabber_grab", new a_grabber_grab());

        SmartDashboard.putData("oi_Lift", new oi_Lift());

        SmartDashboard.putData("sd_move_dist", new sd_move_dist());

        SmartDashboard.putData("sd_lift_dist", new sd_lift_dist());

        SmartDashboard.putData("sd_drive_turn_angle", new sd_drive_turn_angle());

        SmartDashboard.putData("sd_strafe_dist", new sd_strafe_dist());

        SmartDashboard.putData("a_grabber_push", new a_grabber_push());

        SmartDashboard.putData("auto_3totes_norc", new auto_3totes_norc());

        SmartDashboard.putData("a_lift_setup", new a_lift_setup());

        SmartDashboard.putData("auto_1tote_pos3", new auto_1tote_pos3());

        SmartDashboard.putData("auto_1tote_pos2", new auto_1tote_pos2());

        SmartDashboard.putData("auto_1tote_pos1", new auto_1tote_pos1());

        SmartDashboard.putData("auto_1tote_pos1_lm2", new auto_1tote_pos1_lm2());

        SmartDashboard.putData("auo_2tote_pos2", new auo_2tote_pos2());

        SmartDashboard.putData("auto_2tote_pos1", new auto_2tote_pos1());

        SmartDashboard.putData("oi_containerUprighter", new oi_containerUprighter());

        SmartDashboard.putData("oi_Stabilizer", new oi_Stabilizer());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        xbox = new Xbox(aux);
//        SmartDashboard.putData("a_lift_move_time(1 sec, up)", new a_lift_move_time(1, 1));
//        SmartDashboard.putData("a_lift_move_time(1 sec, down)", new a_lift_move_time(1, -1));
//        SmartDashboard.putData("a_drive_move_dist(12inches, fwd)", new a_drive_move_dist(12*4));
//        SmartDashboard.putData("a_drive_turn_angle(45)", new a_drive_turn_angle(45));
//        SmartDashboard.putData("a_drive_turn_angle(-45)", new a_drive_turn_angle(-45));
        
        SmartDashboard.putData("01 a_drive_move_time(.25, .5)", new a_drive_move_time(.25, .5));
        SmartDashboard.putData("02 a_grabber_ungrab()", new a_grabber_ungrab());
        SmartDashboard.putData("03 a_lift_bottom()", new a_lift_bottom());
        SmartDashboard.putData("04 a_grabber_grab()", new a_grabber_grab());
        SmartDashboard.putData("05", new a_lift_move_time(1.25, 1));
        SmartDashboard.putData("06 a_drive_turn_angle(45)", new a_drive_turn_angle(45));
        SmartDashboard.putData("07 a_drive_move_dist(40)", new a_drive_move_dist(40));
        SmartDashboard.putData("08 a_drive_turn_angle(-45)", new a_drive_turn_angle(-45));
        SmartDashboard.putData("09 a_drive_move_dist(15)", new a_drive_move_dist(15));
        SmartDashboard.putData("10 a_drive_turn_angle(-45)", new a_drive_turn_angle(-45));
        SmartDashboard.putData("11 a_drive_move_dist(35)", new a_drive_move_dist(35));
        SmartDashboard.putData("12 a_drive_turn_angle(45)", new a_drive_turn_angle(45));
        //SmartDashboard.putData("13 a_drive_strafe_dist(12, .5)", new a_drive_strafe_dist(12, .5));
//        
//        SmartDashboard.putData("a_drive_move_dist( 6, fwd)", new a_drive_move_dist(6*1));
//        SmartDashboard.putData("a_drive_move_dist(12, fwd)", new a_drive_move_dist(6*2));
//        SmartDashboard.putData("a_drive_move_dist(18, fwd)", new a_drive_move_dist(6*3));
//        SmartDashboard.putData("a_drive_move_dist(24, fwd)", new a_drive_move_dist(6*4));
//        SmartDashboard.putData("a_drive_move_dist(30, fwd)", new a_drive_move_dist(6*5));
//        SmartDashboard.putData("a_drive_move_dist(36, fwd)", new a_drive_move_dist(6*6));
//        SmartDashboard.putData("a_drive_move_dist(42, fwd)", new a_drive_move_dist(6*7));
        SmartDashboard.putData("a_drive_turn_angle(90)", new a_drive_turn_angle(90));
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriver() {
        return driver;
    }

    public Joystick getAux() {
        return aux;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

	
	public Xbox getXbox() {
    	return xbox;
    }
}

