package org.usfirst.frc.team4607.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	public static CANTalon drivetrainFrontLeftMotor;
	public static CANTalon drivetrainRearLeftMotor;
	public static CANTalon drivetrainFrontRightMotor;
	public static CANTalon drivetrainRearRightMotor;
	public static ADXRS450_Gyro drivetrainGyro;
	
	public static CANTalon shooterArmRightGem ;
	public static CANTalon shooterArmLeftGem ;
    public static AnalogGyro shooterArmAnalogGyro ;
    
    public static CANTalon shooterRight;
    public static CANTalon shooterLeft;
    public static CANTalon shooterWinch;
    public static DigitalInput shooterArmUpLimit;
    public static DigitalInput shooterArmDownLimit;
    public static DoubleSolenoid shooterTrigger;
    
    public static Compressor pneumaticsCompressor;
    
    public static void init(){
    
    	 drivetrainFrontLeftMotor = new CANTalon(6);
    	 drivetrainRearLeftMotor = new CANTalon(7);
    	 drivetrainFrontRightMotor = new CANTalon(8);
    	 drivetrainRearRightMotor = new CANTalon(9);
    	 drivetrainGyro = new ADXRS450_Gyro();
    	
    	 shooterArmRightGem = new CANTalon(1);
    	 shooterArmLeftGem = new CANTalon(4);
    	 shooterArmAnalogGyro = new AnalogGyro(0);
    	 shooterArmUpLimit = new DigitalInput(0);
    	 shooterArmDownLimit = new DigitalInput(1);
    	 
    	 shooterRight = new CANTalon(2);
    	 shooterLeft = new CANTalon(3);
    	 shooterWinch = new CANTalon(5);
    	 shooterTrigger = new DoubleSolenoid(0,1);
    	 
    	 pneumaticsCompressor = new Compressor();
    	
    }
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
