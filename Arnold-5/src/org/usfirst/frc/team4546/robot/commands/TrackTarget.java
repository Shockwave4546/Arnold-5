package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TrackTarget extends CommandGroup {
	
	double x = Robot.table.getNumber("midpointX", 0.0);
	double y = Robot.table.getNumber("midpointY", 0.0);
	
	public TrackTarget() {
		addParallel(new TrackTargetX(x));
		addParallel(new TrackTargetY(y));
	}
}
