package org.usfirst.frc.team811.robot.commands;

import org.usfirst.frc.team811.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class shoot_stop extends Command {

    public shoot_stop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter);
    	setTimeout(1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.stopShooter();
    	Robot.shooter.loadShooterOff();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.stopShooter();
    	Robot.shooter.loadShooterOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.shooter.stopShooter();
    	Robot.shooter.loadShooterOff();
    }
}
