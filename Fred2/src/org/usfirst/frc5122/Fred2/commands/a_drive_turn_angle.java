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
import org.usfirst.frc5122.Fred2.RobotMap;
import org.usfirst.frc5122.Fred2.U;

import edu.wpi.first.wpilibj.command.PIDCommand;

/**
 *
 */
public class  a_drive_turn_angle extends PIDCommand {
	
	private final static double kp = .095;
	private final static double ki = .0005;
	private final static double kd = .9;

	private double angle;
	double THRESH = 5;
	private double max;
	boolean rampUP;
	public a_drive_turn_angle(double angle, double p, double i, double d, double max, boolean rampUP) {
		super("a_drive_turn_angle", p, i, d, 0.02);
		this.angle = angle;
		this.max = max;
		this.rampUP = rampUP;
		getPIDController().setContinuous(false);
        getPIDController().setAbsoluteTolerance(0.2);
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drive);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	}
	public a_drive_turn_angle(double angle, double speed, boolean rampUP) {
		this(angle, kp, ki, kd, speed, rampUP);
	}
	public a_drive_turn_angle(double angle, double speed) {
		this(angle, kp, ki, kd, speed, true);
	}
    public a_drive_turn_angle(double angle) {
    	this(angle, 1);
    }
    

    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:subystem
        // yourPot.getAverageVoltage() / kYourMaxVoltage;


        return Robot.drive.getGyroAngle();

    }

    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    	

    	output = U.constrain(-max, output, max);
    	if (Math.abs(output) < .4 && output != 0) {
    		output = (output/Math.abs(output))*.4;
    	}
    	if (rampUP)
    	{
	    	if ((timeSinceInitialized()*2+.4)<1) {
	    		output = output * (timeSinceInitialized()*2+.4);
	    	}
	    }
        Robot.drive.HDrive(0, output, 0);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.resetGyro();
    	getPIDController().setSetpoint(angle);
    	getPIDController().enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Math.abs(getPIDController().getError()) <= 1.5 && Robot.drive.gyro1.getRate() < 4;// && RobotMap.drivegyro.getRate() < 1;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.stop();
    	getPIDController().disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
