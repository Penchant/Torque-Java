package org.usfirst.frc.team4607.robot.subsystems;

import org.usfirst.frc.team4607.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Compressor compressor;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    //Name sort of misleading in that pneumatics are also hiding out with the shooter currently
    public Pneumatics(){
    	compressor = RobotMap.pneumaticsCompressor;
    	compressor.start();
    }
}

