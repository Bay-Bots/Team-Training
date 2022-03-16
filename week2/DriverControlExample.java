// imports for FTC library
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Driver Control Example")
public class DriverControlExample extends OpMode {
  /* Here you will declare private variables that are only 
   * accessible in this class. 
   * 
   *
   * What is the overall goal? 
   * 1) Control servos
   * 2) Map to hardware 
   * 3) Write conditional statements for driver control 
   *
   * If you need help, first refer to the code at:
   *  - https://github.com/Bay-Bots/Team-Training/blob/main/week1/SimpleMotor.java
   *  - https://github.com/Bay-Bots/FTC-Freight-Frenzy
   * Good luck!
   */
  private testingServo; 


  @Override
  public void init() {
    /* This method is where we initialize the variables previously declared. 
     * Here, we can map the devices in our phones to the program allowing 
     * them to communicate. Refer to last week's example for a more detailed 
     * description of how to do this. 
     *
     * Hint: When we used dc motors, the type was DcMotor; however, here the 
     * type will be Servo. 
     * Ex. Use: DcMotor.class      becomes ----> Servo.class
     */
  }

  @Override
  public void loop() {
    /* The loop method allows us to check for a button press and take actions
     * accordinly. 
     * 
     * To access a button, first type the gamepad you're looking 
     * to program.    
     *
     * Ex.: gamepad1 or gamepad2
     *
     * Next, type the button name that will be used. All buttons can be found here (https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/hardware/Gamepad.html).
     *
     * Ex. Code: 
     --------------
     ```java
     if (gamepad1.a) {
        // do something...
        exampleMotor.setPower(1.0);
     }
     else if (...) {
        ...
     }
     else {
        ...
     }
     ```
     --------------
     * This can get more complex for driving as seen below... 
     * but once this is written, we can continue to reuse 
     * it in future seasons (like next year)
     --------------
     ```java
        float gamepad1LeftY = -gamepad1.left_stick_y;
        float gamepad1LeftX = gamepad1.left_stick_x;
        float gamepad1RightX = -gamepad1.right_stick_x;
        float frontRightPower = -gamepad1LeftY + gamepad1LeftX + gamepad1RightX;
        float frontLeftPower = -gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
        float backLeftPower = -gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
        float backRightPower = -gamepad1LeftY - gamepad1LeftX + gamepad1RightX;

        motorFrontLeft.setPower(frontLeftPower);
        motorBackLeft.setPower(backLeftPower);
        motorFrontRight.setPower(frontRightPower);
        motorBackRight.setPower(backRightPower);
     ```
     --------------
     * Hint: When using servos, we run to a position (rotation) between 0 and 1. 
     * Ex. Use: someExampleServo.setPosition(0.50) // this is half of the full distance
          
  }
}
