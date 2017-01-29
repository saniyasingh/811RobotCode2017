package org.usfirst.frc.team811.robot.subsystems;

import org.usfirst.frc.team811.robot.Config;
import org.usfirst.frc.team811.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem implements Config {

	Joystick joy2 = RobotMap.joystick2;
	
	Relay climber = RobotMap.climber;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void climbUp() {
    	climber.set(Relay.Value.kForward);
    }
    
    public void climbOff() {
    	climber.set(Relay.Value.kReverse);
    }
    
    public void climbDown() {
    	climber.set(Relay.Value.kOff);
    }
    		
    
}

