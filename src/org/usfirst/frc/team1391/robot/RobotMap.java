/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1391.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

//All temporary placeholder values
public class RobotMap {
	
	/** BUTTON MAPPING **/
	static final int driverJoystickPort = 0;
	
	public static final int swerveRotationAxisPort = 2;
	
	/** MOTOR PORTS **/
	public final static int backRightSpeedMotorPort = 0;
	public final static int backRightRotateMotorPort = 1;
	
	public final static int backLeftSpeedMotorPort = 2;
	public final static int backLeftRotateMotorPort = 3;
	
	public final static int frontRightSpeedMotorPort = 4;
	public final static int frontRightRotateMotorPort = 5;
	
	public final static int frontLeftSpeedMotorPort = 6;
	public final static int frontLeftRotateMotorPort = 7;
	
	/** SENSOR PORTS **/
	public final static int backRightEncoderPort = 0;
	
	public final static int backLeftEncoderPort = 1;
	
	public final static int frontRightEncoderPort = 2;
	
	public final static int frontLeftEncoderPort = 3;

}
