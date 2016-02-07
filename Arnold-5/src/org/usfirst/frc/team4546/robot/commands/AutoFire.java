package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.Robot;
import org.usfirst.frc.team4546.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoFire extends CommandGroup {
	
	double midpointX = Robot.table.getNumber("midpointX", 0.0);
	double midpointY = Robot.table.getNumber("midpointY", 0.0);
	boolean hasBall = RobotMap.protoCannonLimitSwitch.get();
	public boolean seesTarget() {
		if((midpointX == 0.0) && (midpointY == 0.0)) {
			return false;
		} else {
			return true;
		}
	}
	
	public	AutoFire()	{
		if(seesTarget() && hasBall) {
			addSequential(new );
		} else {
			addParallel(new ControlCannon(Robot.oi.getDriveStick().getX(), Robot.oi.getDriveStick().getY(), Robot.oi.getDriveStick().getBumper(), 100));
		}
		
	}

}
