package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Switch extends Command {
	
	boolean state;
	
	public Switch(boolean state)	{
		
		this.state = state;
	
	}

	protected void initialize() {
		Robot.testStuff.setSolenoid(state);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {

	}

}
