package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.*;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;

public class TrackTarget extends PIDCommand {

	static double p = 0.01;
	static double i = 0;
	static double d = 0;
	static double tolerance = 2.0f;
	double turnRate;
	double targetDistance;
	
	public TrackTarget(double targetDistance) {
		super("Track Target", p, i, d);
		getPIDController().setInputRange(minimumInput, maximumInput);
		getPIDController().setOutputRange(-1.0, 1.0);
		getPIDController().setAbsoluteTolerance(tolerance);
		getPIDController().setContinuous(true);								
		
		this.targetDistance = targetDistance;
	}
	
	protected double returnPIDInput() {
		return targetDistance;
	}

	protected void usePIDOutput(double output) {
		
		turnRate = output;
		
	}

	protected void initialize() {

	}

	protected void execute() {
	Robot.protoCannon.setMotor(turnRate);
		
	}

	protected boolean isFinished() {
		return targetDistance == 0;
	}

	protected void end() {
		cancel();
	}

	protected void interrupted() {

	}

}
