package org.usfirst.frc.team1391.robot;

//TODO all values now are temporary placeholders

//Put all constants not related to ports here
public class RobotConst {
	
	//Need to find and specify unit of measurement
	//robot dimensions, needed for accurate turning
	public final static double robotWidth = 30;
	public final static double robotLength = 20;
	
	//speed converter from 0 to 1 to other value
	public final static double swerveSpeedConverter = 3.0;
	
	//PID for swerve wheels
	public final static double MAX_VOLTS = 4.8;
	public final static double swerveP = 0.5;
	public final static double swerveI = 0.1;
	public final static double swerveD = 0.1;
	
	
}
