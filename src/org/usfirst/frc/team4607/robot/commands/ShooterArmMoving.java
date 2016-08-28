package org.usfirst.frc.team4607.robot.commands;

import org.usfirst.frc.team4607.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShooterArmMoving extends Command {
	
	double speed;
	
	public ShooterArmMoving(double speed){
		this.speed=speed;
		requires(Robot.shooterArm);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.shooterArm.ShooterArmMove(speed);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
