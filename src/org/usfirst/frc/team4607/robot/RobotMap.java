package org.usfirst.frc.team4607.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	public static CANTalon drivetrainFrontLeftMotor = new CANTalon(6);
	public static CANTalon drivetrainRearLeftMotor = new CANTalon(7);
	public static CANTalon drivetrainFrontRightMotor = new CANTalon(8);
	public static CANTalon drivetrainRearRightMotor = new CANTalon(9);
	public static ADXRS450_Gyro drivetrainGyro = new ADXRS450_Gyro();
	
	public static CANTalon shooterArmRightGem = new CANTalon(1);
	public static CANTalon shooterArmLeftGem = new CANTalon(4);
    public static AnalogGyro shooterArmAnalogGyro = new AnalogGyro(0);
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
