package swerve;

import org.usfirst.frc.team1391.robot.RobotConst;

//Refer to links on wiki for more details on math
public class SwerveDrive {
	
	
	private SwerveWheel backRight, backLeft, frontRight, frontLeft;
	
	public SwerveDrive(SwerveWheel backRight, SwerveWheel backLeft, SwerveWheel frontRight, SwerveWheel frontLeft) {
		this.backRight = backRight;
		this.backLeft = backLeft;
		this.frontRight = frontRight;
		this.frontLeft = frontLeft;
	}
	
	public void move(double x1, double y1, double x2) {
		double robotRadius = Math.sqrt(RobotConst.robotLength*RobotConst.robotLength + RobotConst.robotWidth*RobotConst.robotWidth);
		
		//variables used to calculate turning and speed for each motor
		double a = x1 - x2 * (RobotConst.robotLength/robotRadius); 
		double b = x1 + x2 * (RobotConst.robotLength/robotRadius);
		double c = y1 - x2 * (RobotConst.robotWidth/robotRadius);
		double d = y1 + x2 * (RobotConst.robotWidth/robotRadius);
		
		//these speeds vary between 0 and 1, need a translator for higher speeds
		double backRightSpeed = RobotConst.swerveSpeedConverter*Math.sqrt ((a * a) + (d * d));
	    double backLeftSpeed = RobotConst.swerveSpeedConverter*Math.sqrt ((a * a) + (c * c));
	    double frontRightSpeed = RobotConst.swerveSpeedConverter*Math.sqrt ((b * b) + (d * d));
	    double frontLeftSpeed = RobotConst.swerveSpeedConverter*Math.sqrt ((b * b) + (c * c));
	    
	    //math for angles
	    double backRightAngle = Math.atan2 (a, d) / Math.PI;
	    double backLeftAngle = Math.atan2 (a, c) / Math.PI;
	    double frontRightAngle = Math.atan2 (b, d) / Math.PI;
	    double frontLeftAngle = Math.atan2 (b, c) / Math.PI;
	    
	    backRight.drive (backRightSpeed, backRightAngle);
	    backLeft.drive (backLeftSpeed, backLeftAngle);
	    frontRight.drive (frontRightSpeed, frontRightAngle);
	    frontLeft.drive (frontLeftSpeed, frontLeftAngle);
	}
}
