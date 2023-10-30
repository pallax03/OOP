package it.unibo.design.robot.component.impl;

public class BasicArm{
    public static final double GRAB_DELTA_CONSUMPTION = 0.2;

    private String name;
    private boolean grab;

    public BasicArm(final String name) {
        grab = false;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

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
