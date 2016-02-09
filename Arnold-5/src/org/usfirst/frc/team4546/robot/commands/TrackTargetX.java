package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.*;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;

public class TrackTargetX extends PIDCommand {

	static double p = 0.01;
	static double i = 0;
	static double d = 0;
	static double tolerance = 2.0f;
	static double minimumInput = 0;
	static double maximumInput = 320;
	double turnRate;
	double targetDistanceX;
	
	public TrackTargetX(double x) {
		super("Track Target", p, i, d);
		getPIDController().setInputRange(minimumInput, maximumInput);
		getPIDController().setOutputRange(-1.0, 1.0);
		getPIDController().setAbsoluteTolerance(tolerance);
		getPIDController().setContinuous(true);								
		
		this.targetDistanceX = 160 - x;
	}
	
	protected double returnPIDInput() {
		return targetDistanceX;
	}

	protected void usePIDOutput(double output) {
		
		turnRate = output;
		
	}

	protected void initialize() {
	
	}

	protected void execute() {
	Robot.protoCannon.setYawMotor(turnRate);
		
	}

	protected boolean isFinished() {
		return targetDistanceX == 0;
	}

	protected void end() {
		cancel();
	}

	protected void interrupted() {

	}

}
