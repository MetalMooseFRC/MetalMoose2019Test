/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1391.robot.subsystems;

import org.usfirst.frc.team1391.robot.RobotMap;
import org.usfirst.frc.team1391.robot.commands.DrivetrainSwerve;

import edu.wpi.first.wpilibj.command.Subsystem;
import swerve.SwerveDrive;
import swerve.SwerveWheel;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
	//creating swerve wheels and swerve drive for drivetrain
	private SwerveWheel backRight = new SwerveWheel (RobotMap.backRightSpeedMotorPort, RobotMap.backRightRotateMotorPort, 
			RobotMap.backRightEncoderA, RobotMap.backRightEncoderB);
	private SwerveWheel backLeft = new SwerveWheel (RobotMap.backLeftSpeedMotorPort, RobotMap.backLeftRotateMotorPort, 
			RobotMap.backLeftEncoderA, RobotMap.backLeftEncoderB);
	private SwerveWheel frontRight = new SwerveWheel (RobotMap.frontRightSpeedMotorPort, RobotMap.frontRightRotateMotorPort, 
			RobotMap.frontRightEncoderA, RobotMap.frontRightEncoderB);
	private SwerveWheel frontLeft = new SwerveWheel (RobotMap.frontLeftSpeedMotorPort, RobotMap.frontLeftRotateMotorPort, 
			RobotMap.frontLeftEncoderA, RobotMap.frontLeftEncoderB);

	private SwerveDrive swerveDrive = new SwerveDrive (backRight, backLeft, frontRight, frontLeft);

	public void initDefaultCommand() {
		setDefaultCommand(new DrivetrainSwerve());
	}
	
	public void drive(double x1, double y1, double x2) {
		swerveDrive.move(x1, y1, x2);
	}
}
