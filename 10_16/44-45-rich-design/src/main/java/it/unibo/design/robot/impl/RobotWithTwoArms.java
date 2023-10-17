package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    private final BasicArm left_arm;
    private final BasicArm right_arm;

    public RobotWithTwoArms(String robotName) {
        super(robotName);
        this.left_arm = new BasicArm("left arm");
        this.right_arm = new BasicArm("right arm");
    }

    public boolean pickUp() {
        if(!left_arm.isGrabbing()) {
            left_arm.pickUp();

            if(super.isBatteryEnough(left_arm.getConsumptionForPickUp())) {
                super.consumeBattery(left_arm.getConsumptionForPickUp());
            }
            return true;
        } else if(!right_arm.isGrabbing()) {
            right_arm.pickUp();

            if(super.isBatteryEnough(right_arm.getConsumptionForPickUp())) {
                super.consumeBattery(right_arm.getConsumptionForPickUp());
            }
            return true;
        }
        return false;
    }

    public boolean dropDown() {
        if(left_arm.isGrabbing()) {
            left_arm.dropDown();

            if(super.isBatteryEnough(left_arm.getConsumptionForDropDown())) {
                super.consumeBattery(left_arm.getConsumptionForDropDown());
            }
            return true;
        } else if(right_arm.isGrabbing()) {
            right_arm.dropDown();

            if(super.isBatteryEnough(right_arm.getConsumptionForDropDown())) {
                super.consumeBattery(right_arm.getConsumptionForDropDown());
            }
            return true;
        }
        return false;
    }

    public int getCarriedItemsCount() {
        int count = 0;
        count += left_arm.isGrabbing() ? 1 : 0;
        count += right_arm.isGrabbing() ? 1 : 0;
        return count;
    }
    
}
