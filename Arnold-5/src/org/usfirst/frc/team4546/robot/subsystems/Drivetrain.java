package org.usfirst.frc.team4546.robot.subsystems;

import org.usfirst.frc.team4546.robot.RobotMap;
import org.usfirst.frc.team4546.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

	Talon frontleft = RobotMap.drivetrainFrontLeft;
	Talon frontright = RobotMap.drivetrainFrontRight;
	Talon rearleft = RobotMap.drivetrainRearLeft;
	Talon rearright = RobotMap.drivetrainRearRight;
	RobotDrive chassis = RobotMap.drivetrainChassis;
	
	protected void initDefaultCommand() {

		setDefaultCommand(new Drive());
		
	}	
	
	public void drive (double magnitude, double rotate, double speed)	{
		
		chassis.arcadeDrive(magnitude*speed, rotate*speed);
	}

}
