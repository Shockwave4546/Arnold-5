package org.usfirst.frc.team4546.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ControlCannon extends CommandGroup {
	public ControlCannon(double x, double y, boolean fireButton, double fireSpeed) {
		addParallel(new YawCannon(x));
		addParallel(new PitchCannon(y));
		if(fireButton) {
			addSequential(new FireCannon(fireSpeed), 1);
		}
	}
}