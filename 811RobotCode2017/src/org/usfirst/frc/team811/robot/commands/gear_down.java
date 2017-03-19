package org.usfirst.frc.team811.robot.commands;

import org.usfirst.frc.team811.robot.Config;
import org.usfirst.frc.team811.robot.Robot;
import org.usfirst.frc.team811.robot.RobotMap;

import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class gear_down extends Command implements Config{

    public gear_down() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.geargrabber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.gearGrabber.setPID(1.0, 0.0, 0.0); //numbers are temporary
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.gearGrabber.changeControlMode(TalonControlMode.Position);
    	
    	RobotMap.gearGrabber.set(GEAR_DOWN_ANGLE);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return false; //TODO
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.gearGrabber.changeControlMode(TalonControlMode.PercentVbus);
    	RobotMap.gearGrabber.changeControlMode(TalonControlMode.PercentVbus);
    	
    	RobotMap.gearGrabber.set(0);
    	RobotMap.gearGrabber.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.gearGrabber.changeControlMode(TalonControlMode.PercentVbus);
    	RobotMap.gearGrabber.changeControlMode(TalonControlMode.PercentVbus);
    	
    	RobotMap.gearGrabber.set(0);
    	RobotMap.gearGrabber.set(0);
    }
}
