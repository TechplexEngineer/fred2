package org.usfirst.frc5122.Fred2;

import edu.wpi.first.wpilibj.Joystick;

public class Xbox extends Joystick {

	Xbox(int port) {
		super(port);
	}
 
	public boolean isA() {
		return getRawButton(0);
	}
	public boolean isB() {
		return getRawButton(1);
	}
	public boolean isX() {
		return getRawButton(2);
	}
	public boolean isY() {
		return getRawButton(3);
	}
	public boolean isLB() {
		return getRawButton(4);
	}
	public boolean isRB() {
		return getRawButton(5);
	}
	public boolean isBack() {
		return getRawButton(6);
	}
	public boolean isStart() {
		return getRawButton(7);
	}
	public boolean isLeftStick() {
		return getRawButton(8);
	}
	public boolean isRightStick() {
		return getRawButton(9);
	}
 
 
 
	public double getLeftStickX() {
		return getRawAxis(0);
	}
	public double getLeftStickY() {
		return getRawAxis(1);
	}
 
	public double getLeftTrigger() {
		return getRawAxis(2);
	}
	public double getRightTrigger() {
		return getRawAxis(3);
	}
 
	public double getRightStickX() {
		return getRawAxis(4);
	}
	public double getRightStickY() {
		return getRawAxis(5);
	}
 
//	public double getRawButton(int button) {
//		joystick_.getRawButton(button);
//	}
//	public double getAxisButton(int button) {
//		joystick_.getAxisButton(button);
//	}
 
}
