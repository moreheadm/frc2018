package org.usfirst.frc.team6662.robot.commands;

import org.usfirst.frc.team6662.robot.AutoMeasures;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoRoutePosAScaleL extends CommandGroup {

    public AutoRoutePosAScaleL() {
    	
    	addSequential(new DriveDistance(AutoMeasures.TO_SCALE_Y));
		addSequential(new TurnAngle(90));
		addSequential(new DriveDistance(AutoMeasures.TO_SCALE_X));
		addSequential(new MoveElevatorToPosition(AutoMeasures.SCALE_HEIGHT));
		addSequential(new MoveRolleyGrabber(1.0, 1.0, "out"));
		
    }
}
