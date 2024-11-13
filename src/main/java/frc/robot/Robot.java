// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.xrp.XRPMotor;
import edu.wpi.first.wpilibj.xrp.XRPServo;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */

public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

XboxController m_cailyn = new XboxController(0);
XRPMotor  m_left = new XRPMotor(0);
XRPMotor  m_right = new XRPMotor(1);
XRPServo a_Servo = new XRPServo(4);

  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {

    m_right.setInverted(true);
    a_Servo.setAngle(90);

  }

  

  @Override
  public void teleopPeriodic() 
  {
    double left_stick = -m_cailyn.getLeftY();
    double right_stick = -m_cailyn.getRightY();
    m_left.set(left_stick);
    m_right.set(right_stick);
    boolean hi = m_cailyn.getAButton();
    if (hi) {

      a_Servo.setAngle(90);
      
    }
    else {

    a_Servo.setAngle(0);

    }
    



  }



  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
