package it.unibo.design.robot.component.impl;

import it.unibo.design.robot.component.api.CommandableRobotPart;

public class RobotArm extends CommandableRobotPart {

    // ARM FIELDS
    public static final double GRAB_DELTA_CONSUMPTION = 0.2;
    private boolean grab;
    
    private String PICKUP_METHOD_NAME = "pickUp";
    private String DROPDOWN_METHOD_NAME = "dropDown";

    public RobotArm() {
        super();
        setCommands(new String[] {PICKUP_METHOD_NAME, DROPDOWN_METHOD_NAME});
    }

    @Override
    public void sendCommand(String command) {
        if(command.equalsIgnoreCase(PICKUP_METHOD_NAME)) {
            pickUp();
        } else if(command.equalsIgnoreCase(DROPDOWN_METHOD_NAME)) {
            dropDown();
        }
    }

    //ARM METHODS

    public boolean isGrabbing() {
        return this.grab;
    }

    public void pickUp() {
        this.grab = true;
    }
    
    public void dropDown() {
        this.grab = false;
    }
    
    public double getConsumptionForPickUp() {
        return GRAB_DELTA_CONSUMPTION;
    }
    
    public double getConsumptionForDropDown() {
        return GRAB_DELTA_CONSUMPTION;        
    }

}
