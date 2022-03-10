package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class SingleMotor extends LinearOpMode {
    // declare variables
    private DcMotor testMotor;
    
    @Override
    public void runOpMode() {
        // locate hardware in phone's device map
        testMotor = hardwareMap.get(DcMotor.class, "testMotor");
        
        // print data to phone console
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        
        // wait until the play button is pressed 
        waitForStart();
        
        // run unless stopped 
        while (opModeIsActive()) {
            // set motor power/speed
            testMotor.setPower(0.50);
            // run the previous line for 5 seconds 
            sleep(5000);
            // force the loop to exit when all steps are complete
            break;
        }
    }
}

