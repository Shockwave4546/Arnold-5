package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AimToFire extends Command {


	
	double theta = RobotMap.protoCannonPotentiometer.get();
	double sinTheta = Math.sin(theta);
	double theta2 = 90 - theta;
	
	double cannonHeight;	//Physically Measured
	double PMHeight;		//Physically Measured
	double dEOCToCamera;	//Physically Measured
	
	public double getHPMToEOC() {
		return Math.sin(theta2) * cannonHeight;
	}
	public double getHCameraToEOC() {
		return dEOCToCamera/Math.sin(theta);
	}
	
	double hPMToEOC = getHPMToEOC();
	double hCameraToEOC = getHCameraToEOC();


	public double getCameraHeight() {
		return hPMToEOC + PMHeight + hPMToEOC;
	}
	
	double cameraHeight = getCameraHeight();
	
	public double getDistance() {
		return (91 - cameraHeight)/sinTheta;
	}
	
	double distance = getDistance();
	
	public AimToFire() {
		
	}
	protected void end() {
		

	}

	
	protected void execute() {
		

	}

	
	protected void initialize() {
		

	}

	
	protected void interrupted() {
		

	}

	
	protected boolean isFinished() {
		
		return false;
	}

}
