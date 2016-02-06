package org.usfirst.frc.team4546.robot.subsystems;

import org.usfirst.frc.team4546.robot.Robot;
import org.usfirst.frc.team4546.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4546.robot.commands.*;

public class ProtoCannon extends Subsystem {

	Talon motor = RobotMap.testStuffMotor;
	
	protected void initDefaultCommand() {
		setDefaultCommand(new TrackTarget(Robot.table.getNumber("midpointX", 0.0)));
	}
	
	public void setMotor(double speed)	{
		motor.set(speed);
	}
	
}
