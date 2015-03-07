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
    
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveLeftFront;
    public static SpeedController driveLeftRear;
    public static SpeedController driveRightFront;
    public static SpeedController driveRightRear;
    public static RobotDrive driveDrivetrain;
    public static SpeedController driveStrafe;
    public static Gyro drivegyro;
    public static Encoder driveLeftEncoder;
    public static Encoder driveRightEncoder;
    public static Encoder driveHdriveEncoder;
    public static SpeedController liftLift;
    public static DigitalInput liftTopLimit;
    public static DigitalInput liftBottomLimit;
    public static SpeedController liftLiftCim;
    public static Encoder liftLiftEncoder;
    public static DoubleSolenoid liftStabilizer;
    public static Solenoid grabberPurpleTopLights;
    public static Solenoid grabberGreenTopLight;
    public static Solenoid grabberToteGripper;
    public static DoubleSolenoid grabberPusher;
    public static Solenoid grabberContainerUpright;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static PowerDistributionPanel pdp;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveLeftFront = new Talon(0);
        LiveWindow.addActuator("Drive", "LeftFront", (Talon) driveLeftFront);
        
        driveLeftRear = new Talon(1);
        LiveWindow.addActuator("Drive", "LeftRear", (Talon) driveLeftRear);
        
        driveRightFront = new Talon(2);
        LiveWindow.addActuator("Drive", "RightFront", (Talon) driveRightFront);
        
        driveRightRear = new Talon(3);
        LiveWindow.addActuator("Drive", "RightRear", (Talon) driveRightRear);
        
        driveDrivetrain = new RobotDrive(driveLeftFront, driveLeftRear,
              driveRightFront, driveRightRear);
        
        driveDrivetrain.setSafetyEnabled(true);
        driveDrivetrain.setExpiration(0.1);
        driveDrivetrain.setSensitivity(0.5);
        driveDrivetrain.setMaxOutput(1.0);

        driveStrafe = new Talon(4);
        LiveWindow.addActuator("Drive", "Strafe", (Talon) driveStrafe);
        
        drivegyro = new Gyro(0);
        LiveWindow.addSensor("Drive", "gyro", drivegyro);
        drivegyro.setSensitivity(0.007);
        driveLeftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "LeftEncoder", driveLeftEncoder);
        driveLeftEncoder.setDistancePerPulse(0.05235987755982989);
        driveLeftEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        driveRightEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "RightEncoder", driveRightEncoder);
        driveRightEncoder.setDistancePerPulse(0.05235987755982989);
        driveRightEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        driveHdriveEncoder = new Encoder(8, 9, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "HdriveEncoder", driveHdriveEncoder);
        driveHdriveEncoder.setDistancePerPulse(0.05235987755982989);
        driveHdriveEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        liftLift = new Talon(5);
        LiveWindow.addActuator("Lift", "Lift", (Talon) liftLift);
        
        liftTopLimit = new DigitalInput(4);
        LiveWindow.addSensor("Lift", "TopLimit", liftTopLimit);
        
        liftBottomLimit = new DigitalInput(5);
        LiveWindow.addSensor("Lift", "BottomLimit", liftBottomLimit);
        
        liftLiftCim = new Talon(8);
        LiveWindow.addActuator("Lift", "LiftCim", (Talon) liftLiftCim);
        
        liftLiftEncoder = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("Lift", "LiftEncoder", liftLiftEncoder);
        liftLiftEncoder.setDistancePerPulse(0.0114583333333333);
        liftLiftEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        liftStabilizer = new DoubleSolenoid(0, 4, 5);      
        LiveWindow.addActuator("Lift", "Stabilizer", liftStabilizer);
        
        grabberPurpleTopLights = new Solenoid(0, 6);
        LiveWindow.addActuator("Grabber", "PurpleTopLights", grabberPurpleTopLights);
        
        grabberGreenTopLight = new Solenoid(0, 7);
        LiveWindow.addActuator("Grabber", "GreenTopLight", grabberGreenTopLight);
        
        grabberToteGripper = new Solenoid(0, 2);
        LiveWindow.addActuator("Grabber", "ToteGripper", grabberToteGripper);
        
        grabberPusher = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("Grabber", "Pusher", grabberPusher);
        
        grabberContainerUpright = new Solenoid(0, 3);
        LiveWindow.addActuator("Grabber", "ContainerUpright", grabberContainerUpright);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        pdp  = new PowerDistributionPanel();
    }
}
