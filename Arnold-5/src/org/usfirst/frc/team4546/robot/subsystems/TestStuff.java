package org.usfirst.frc.team4546.robot.subsystems;

import org.usfirst.frc.team4546.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TestStuff extends Subsystem {

	Solenoid solenoid = RobotMap.testStuffSolenoid;
	Talon motor = RobotMap.testStuffMotor;
	AnalogInput USSensor = RobotMap.testStuffUSSensor;
	
	protected void initDefaultCommand() {		
	}
	
	public void setSolenoid(boolean enabled) {
		solenoid.set(enabled);		
	}
	
	public void setMotor(double speed)	{
		motor.set(speed);		
	}
	
	public double getVoltage()	{
		return USSensor.getVoltage();
	}
	
	public int getValue()	{
		return USSensor.getValue();
	}
	
	public double getValueDistance()	{
		return USSensor.getValue()/4;
	}
	
	public double getVoltageDistance()	{
		return USSensor.getVoltage()/.0049;
	}
}