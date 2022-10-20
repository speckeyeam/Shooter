// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Robot extends TimedRobot {
  // declare jude-minded motors and controller
  private CANSparkMax flyWheel;
  private CANSparkMax thrust;

  XboxController controller = new XboxController(0);

  @Override
  public void robotInit() {
    // initialize jude-minded motors
    flyWheel = new CANSparkMax(1, MotorType.kBrushless);
    thrust = new CANSparkMax(2, MotorType.kBrushless);
    flyWheel.restoreFactoryDefaults();
    thrust.restoreFactoryDefaults();

  }

  @Override
  public void robotPeriodic() {

    if (controller.getXButton()) {
      thrust.set(2.8);
      flyWheel.set(.5);
    }
    else{
      thrust.set(0);
      flyWheel.set(0);
    }

  }

}
