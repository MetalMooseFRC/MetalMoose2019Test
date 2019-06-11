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
double error;
double errorPrior;
double integral;
double derivative;
double iterationSec = 0.02;

	public DrivetrainSwerve() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.myDrivetrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
        errorPrior = 0;
        integral = 0;
        derivative = 0;
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
        error = Robot.tx.getDouble(0.0);
        integral += error*iterationSec;
        derivative = (error-errorPrior)/iterationSec;

        //assume person is parallel to target and shift left/right accordingly
        double output = RobotConst.visionP*error + RobotConst.visionI*integral + RobotConst.visionD*derivative;
        Robot.myDrivetrain.robotOrientedDrive(output, 0, 0);
        
        errorPrior = error;
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return Robot.tv == 1 || Math.abs(error) < RobotConst.visionAngleMargin;
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
