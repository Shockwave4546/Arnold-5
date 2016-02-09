package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PitchCannon extends Command {
	double speed;
	public PitchCannon(double speed) {
		this.speed = speed;
	}
		
	protected void end() {


	}

	protected void execute() {
		Robot.protoCannon.setPitchMotor(speed);
	}

	protected void initialize() {

	}

	protected void interrupted() {

	}

	protected boolean isFinished() {
		return false;
	}

}
