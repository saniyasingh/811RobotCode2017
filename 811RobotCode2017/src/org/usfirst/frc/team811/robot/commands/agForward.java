package org.usfirst.frc.team811.robot.commands;

import org.usfirst.frc.team811.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class agForward extends Command {

    public agForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.agitator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.agitator.agForward();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.agitator.agOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.agitator.agOff();
    }
}
