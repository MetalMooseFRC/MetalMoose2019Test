package swerve;

import org.usfirst.frc.team1391.robot.RobotConst;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.VictorSP;

public class SwerveWheel {
	private VictorSP angleMotor;
	private VictorSP speedMotor;
	private PIDController rotationController;

	
	public SwerveWheel(int angleMotor, int speedMotor, int encoderA, int encoderB) {
		this.angleMotor = new VictorSP (angleMotor);
	    this.speedMotor = new VictorSP (speedMotor);
	    
	    
	    rotationController = new PIDController(RobotConst.swerveP, RobotConst.swerveI, RobotConst.swerveD, new Encoder (encoderA, encoderB), this.angleMotor);
	    
	    rotationController.setOutputRange (-1, 1);
	    rotationController.setContinuous ();
	    rotationController.enable ();
	}
	
	public void drive(double speed, double angle) {
		speedMotor.set(speed);
		
		//below can be optimized
		double setpoint = angle * (RobotConst.MAX_VOLTS * 0.5) + (RobotConst.MAX_VOLTS * 0.5);
		if (setpoint < 0) {
	        setpoint = RobotConst.MAX_VOLTS + setpoint;
	    }
	    if (setpoint > RobotConst.MAX_VOLTS) {
	        setpoint = setpoint -RobotConst.MAX_VOLTS;
	    }
	    
	    rotationController.setSetpoint(setpoint);
	    
		
	}
	
	
}
