package org.usfirst.frc.team4607.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4607.robot.commands.*;
import org.usfirst.frc.team4607.robot.subsystems.Drivetrain;

//import org.usfirst.frc.team4607.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
/*
 * OI SPEC:
 * 2 Joysticks, driver and shotgun
 * 9 buttons (2 optional)
 * Shotgun Joystick:
 * shooter out/in, (2)
 * moving the shooter arm up and down quick and slow,(4)
 * winch in both directions,(2)
 * bumper ejecting the ball. (1)
 * 
 * Driver Joystick:
 * (optional) one for activating smooth motion 
 * (optional) full speed (if demo mode added)
 *  SmartDashboard:
 *  
 *  Angles for shooter arm
 *  Angle for Drive
 *  More Drive Stuff
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
   // Joystick stick = new Joystick(3);
    //Button button = new JoystickButton(stick, 2);
    Joystick driver = new Joystick(0);
    Joystick shotgun = new Joystick(0);
    public OI() {
    	//Driver Controls
    Button smooth = new JoystickButton(driver, 5);
    Button turbo = new JoystickButton(driver, 10);
    
    smooth.whenPressed(new ChangeAccelLim(.03));
    smooth.whenReleased(new ChangeAccelLim(.07));
    turbo.whenPressed(new ChangeDriveMode(Drivetrain.mode.kComp));
    turbo.whenReleased(new ChangeDriveMode(Drivetrain.mode.kDemo));
    	//Operator Controls
    Button in = new JoystickButton(shotgun, 1);
    Button out = new JoystickButton(shotgun, 2);
    Button armUpQuick = new JoystickButton(shotgun, 3);
    Button armDownQuick = new JoystickButton(shotgun, 4);
    Button armUpSlow = new JoystickButton(shotgun,11);
    Button armDownSlow = new JoystickButton(shotgun, 12);
    Button winchUp = new JoystickButton(shotgun, 7);
    Button winchDown = new JoystickButton(shotgun, 8);
    Button eject = new JoystickButton(shotgun, 6);
    
    
    
    in.whileHeld(new ExampleCommand());
    out.whileHeld(new ExampleCommand());
    armUpQuick.whileHeld(new ExampleCommand());
    armDownQuick.whileHeld(new ExampleCommand());
    armUpSlow.whileHeld(new ExampleCommand());
    armDownSlow.whileHeld(new ExampleCommand());
    winchUp.whileHeld(new ExampleCommand());
    winchDown.whileHeld(new ExampleCommand());
    eject.whileHeld(new ExampleCommand());
    
    //SmartDashboard
    SmartDashboard.putNumber("Shooter Arm Angle", 0);
    SmartDashboard.putNumber("Drive Angle", 0);
    SmartDashboard.putString("Notes", "Add drive smartdashboard stuff.");
    
    }
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.s
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
   //  button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public Joystick getDriver() {
        return driver;
    }
    public Joystick getShotgun(){
    	return shotgun;
    }
}

