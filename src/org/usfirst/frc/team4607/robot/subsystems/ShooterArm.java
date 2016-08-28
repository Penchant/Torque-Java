package org.usfirst.frc.team4607.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CANTalon;
import org.usfirst.frc.team4607.robot.RobotMap;
import org.usfirst.frc.team4607.robot.commands.ShooterArmMoving;;

public class ShooterArm extends Subsystem {
	static CANTalon leftGem,
	rightGem;
	static AnalogGyro Gyro;
	public static final double  UP = 1, DOWN =-1, UP_SLOW = .4, DOWN_SLOW = -.3;
	
	public void initDefaultCommand() {
		setDefaultCommand(new ShooterArmMoving(0));
	}
	public ShooterArm(){
		leftGem = RobotMap.shooterArmLeftGem;
		rightGem = RobotMap.shooterArmRightGem;
		Gyro = RobotMap.shooterArmAnalogGyro;
	}
	public void ShooterArmMove(double speed){
		leftGem.set(speed);
		rightGem.set(-speed);
	}

}
