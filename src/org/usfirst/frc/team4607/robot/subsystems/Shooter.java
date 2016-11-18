package org.usfirst.frc.team4607.robot.subsystems;

import org.usfirst.frc.team4607.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static final double SHOOT = 1, INTAKE =-1;	
	CANTalon left, right, winch;
		
		DoubleSolenoid trigger;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public Shooter(){
		left = RobotMap.shooterLeft;
		right = RobotMap.shooterRight;
		winch = RobotMap.shooterWinch;
		trigger = RobotMap.shooterTrigger;
		trigger.set(DoubleSolenoid.Value.kReverse);
	}
	public void Shoot(double speed){
		
		left.set(speed);
		right.set(-speed);
	}
	public void Winch(double speed){
		winch.set(speed);
	}
	public void Out(){
		trigger.set(DoubleSolenoid.Value.kForward);
		
	}
	public void In(){
		trigger.set(DoubleSolenoid.Value.kReverse);
	}
	
}

