package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FireCannon extends Command {
	
	protected void end() {
		Robot.protoCannon.setFeedBall(0.0);

	}

	
	protected void execute() {
		Robot.protoCannon.setFireLeft(100);
		Robot.protoCannon.setFireRight(100);
		Robot.protoCannon.setFeedBall(75);

	}

	
	protected void initialize() {
		

	}

	
	protected void interrupted() {
		

	}

	
	protected boolean isFinished() {
		
		return false;
	}

}
