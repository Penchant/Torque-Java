
package org.usfirst.frc.team4607.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4607.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
//import java.lang.*; Remove if compiles without, was for Math.abs
import org.usfirst.frc.team4607.robot.commands.Driving;
/**
 *
 */
public class Drivetrain extends Subsystem {
	

	CANTalon frontLeftMotor,
	frontRightMotor,
	rearLeftMotor,
	rearRightMotor;
	RobotDrive drive;
	double movePrior, rotatePrior, accelLim;
	public enum mode { 
		kDemo(.05),kComp(1),kStop(0);
		double multiplier;
		mode(double multiplier){
			this.multiplier = multiplier;
		}
		
		public double getMultiplier(){
			return multiplier;
		}
		
	}
	mode drivingMode;
	
	
	public Drivetrain(){
		frontLeftMotor = RobotMap.drivetrainFrontLeftMotor;
		frontRightMotor = RobotMap.drivetrainFrontRightMotor;
		rearLeftMotor = RobotMap.drivetrainRearLeftMotor;
		rearRightMotor = RobotMap.drivetrainRearRightMotor;
		drive = new RobotDrive(frontLeftMotor,rearLeftMotor, frontRightMotor, rearRightMotor);
		movePrior = 0;
		rotatePrior = 0;
		accelLim = 0.07;
		drivingMode = mode.kDemo;
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Driving());
    }
   public void ArcadeDrive(Joystick joy){
	   
	   double moveValue = SmoothMotion(movePrior, joy.getY()*drivingMode.getMultiplier(), accelLim);
	   double rotateValue = SmoothMotion(rotatePrior, joy.getX()*drivingMode.getMultiplier(), accelLim);
	   drive.arcadeDrive(moveValue, rotateValue);
	   moveValue = movePrior;
	   rotateValue = rotatePrior;
	   
   }
   public double SmoothMotion(double initialSpeed, double setSpeed, double accelLim){
	   double speed, accelSign;
	   if(initialSpeed > setSpeed){
		   accelSign= -1;
	   }
	   else{
		   accelSign = 1;
	   }
	   if(Math.abs(Math.abs(initialSpeed)-Math.abs(setSpeed)) > accelLim){
		   speed = initialSpeed + accelLim* accelSign;
	   }
	   else{
		   speed = setSpeed;
	   }
	   return speed;
   }

public double getAccelLim() {
	return accelLim;
}

public void setAccelLim(double accelLim) {
	this.accelLim = accelLim;
}

public mode getDrivingMode() {
	return drivingMode;
}

public void setDrivingMode(mode drivingMode) {
	this.drivingMode = drivingMode;
}
}

