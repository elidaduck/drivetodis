// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.Autos;
import frc.robot.commands.TurnToAngle;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.DriveToDis;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {
  DriveSubsystem driveSubsystem = new DriveSubsystem();
  

  public RobotContainer() {
    // Configure the trigger bindings
    
    configureBindings();
  }


  private void configureBindings() {

  }


  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return new DriveToDis(1, driveSubsystem)
    .andThen(new TurnToAngle(90, driveSubsystem))
    .andThen(new DriveToDis(1, driveSubsystem))
    .andThen(new TurnToAngle(90, driveSubsystem))
    .andThen(new DriveToDis(1, driveSubsystem))
    .andThen(new TurnToAngle(90, driveSubsystem))
    .andThen(new DriveToDis(1, driveSubsystem))
    .andThen(new TurnToAngle(90, driveSubsystem));
  }
}
