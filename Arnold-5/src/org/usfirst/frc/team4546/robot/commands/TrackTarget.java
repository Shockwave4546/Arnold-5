package org.usfirst.frc.team4546.robot.commands;

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
		return 0;
	}

	protected void usePIDOutput(double output) {
		
		turnRate = output;
		
	}

	protected void initialize() {

	}

	protected void execute() {

	}

	protected boolean isFinished() {
		return ;
	}

	protected void end() {
		cancel();
	}

	protected void interrupted() {

	}

}
