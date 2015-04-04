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

import java.awt.peer.RobotPeer;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc5122.Fred2.Robot;

/**
 *
 */
public class  sd_turn_enc extends Command {
	
	private Preferences prefs;
	public static final String ENC_TURN_KP = "enc_turn_kp";	
	public static final String ENC_TURN_KI = "enc_turn_ki";
	public static final String ENC_TURN_KD = "enc_turn_kd";
	public static final String ENC_TURN_ANGLE = "enc_turn_angle";
	public static final String ENC_TURN_MAX = "enc_turn_max";
	public static final double END_TURN_KP_DEF = 0;
	public static final double END_TURN_KI_DEF = 0;
	public static final double END_TURN_KD_DEF = 0;
	public static final double ENC_TURN_ANGLE_DEF = 90;
	public static final double ENC_TURN_MAX_DEF = .8;
	
	private double kp, ki, kd, angle, max;
	
	private Command cmd;

    public sd_turn_enc() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    	
    	prefs = Preferences.getInstance();
    	
    	if (!prefs.containsKey(ENC_TURN_KP)) {
    		prefs.putDouble(ENC_TURN_KP, END_TURN_KP_DEF);
    	}
    	if (!prefs.containsKey(ENC_TURN_KI)) {
    		prefs.putDouble(ENC_TURN_KI, END_TURN_KI_DEF);
    	}
    	if (!prefs.containsKey(ENC_TURN_KD)) {
    		prefs.putDouble(ENC_TURN_KD, END_TURN_KD_DEF);
    	}
    	if (!prefs.containsKey(ENC_TURN_ANGLE)) {
    		prefs.putDouble(ENC_TURN_ANGLE, ENC_TURN_ANGLE_DEF);
    	}
    	if (!prefs.containsKey(ENC_TURN_MAX)) {
    		prefs.putDouble(ENC_TURN_MAX, ENC_TURN_MAX_DEF);
    	}
    	
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	kp = prefs.getDouble(ENC_TURN_KP, END_TURN_KP_DEF);
    	ki = prefs.getDouble(ENC_TURN_KI, END_TURN_KI_DEF);
    	kd = prefs.getDouble(ENC_TURN_KD, END_TURN_KD_DEF);
    	angle = prefs.getDouble(ENC_TURN_ANGLE, ENC_TURN_ANGLE_DEF);
    	max = prefs.getDouble(ENC_TURN_MAX, ENC_TURN_MAX_DEF);
    	cmd = new a_drive_turn_enc(angle, kp, ki, kd, max);
    	cmd.start();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !cmd.isRunning() || cmd.isCanceled();
    }

    // Called once after isFinished returns true
    protected void end() {
    	cmd.cancel();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}