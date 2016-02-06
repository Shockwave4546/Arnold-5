package org.usfirst.frc.team4546.robot;

import edu.wpi.first.wpilibj.SPI;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static AHRS drivetrainAHRS;
	public static Talon drivetrainFrontLeft;
	public static Talon drivetrainFrontRight;
	public static Talon drivetrainRearLeft;
	public static Talon drivetrainRearRight;
	public static RobotDrive drivetrainChassis;	
	
	public static Solenoid testStuffSolenoid;
	public static Talon testStuffMotor;
	public static AnalogInput testStuffUSSensor;
	
	public static void init()	{
		
		drivetrainFrontLeft = new Talon(0);
		drivetrainFrontRight = new Talon(1);
		drivetrainRearLeft = new Talon(2);
		drivetrainRearRight = new Talon(3);
		
		drivetrainChassis = new RobotDrive(drivetrainFrontLeft, drivetrainFrontRight, drivetrainRearLeft, drivetrainRearRight);
		
		drivetrainChassis.setSafetyEnabled(true);
		drivetrainChassis.setExpiration(0.1);
        drivetrainChassis.setSensitivity(0.5);
        drivetrainChassis.setMaxOutput(1.0);
        
        drivetrainChassis.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        drivetrainChassis.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);                  
       
        
        testStuffSolenoid = new Solenoid(0);                     
        testStuffMotor = new Talon(4);
        testStuffUSSensor = new AnalogInput(0);
        
        drivetrainAHRS = new AHRS(SPI.Port.kMXP);
                
	}
	
}
