package org.usfirst.frc.team4546.robot.subsystems;

import org.usfirst.frc.team4546.robot.Robot;
import org.usfirst.frc.team4546.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4546.robot.commands.*;

public class ProtoCannon extends Subsystem {

	Talon fireRight = RobotMap.protoCannonFireRight;
	Talon fireLeft = RobotMap.protoCannonFireLeft;
	Talon yawMotor = RobotMap.protoCannonYawMotor;
	Talon pitchMotor = RobotMap.protoCannonPitchMotor;
	
	public void setPitchMotor(double speed) {
		pitchMotor.set(speed);
	}
	
	public void setYawMotor(double speed) {
		yawMotor.set(speed);
	}
	
	public void setFireLeft(double speed) {
		fireLeft.set(speed);
	}
	
	public void setFireRight(double speed) {
		fireRight.set(speed);
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand(new ControlCannon(Robot.oi.getDriveStick().getX(), 0, false, 0));
	}
	
	
}
