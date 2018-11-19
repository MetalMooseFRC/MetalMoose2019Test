/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1391.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1391.robot.Robot;
import org.usfirst.frc.team1391.robot.RobotMap;

/**
 * An example command.  You can replace me with your own command.
 */
public class DrivetrainSwerve extends Command {
	public DrivetrainSwerve() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.myDrivetrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		double x1 = Robot.myOI.driveJoy.getX();
		double y1 = -Robot.myOI.driveJoy.getY();
		//placeholder axis port
		double x2 = Robot.myOI.driveJoy.getRawAxis(RobotMap.swerveRotationAxisPort);
		
		Robot.myDrivetrain.drive(x1, y1, x2);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
