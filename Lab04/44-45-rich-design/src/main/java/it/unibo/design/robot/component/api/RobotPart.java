package it.unibo.design.robot.component.api;

public abstract class RobotPart implements RobotComponent{
    private boolean state = false;
    private String attached_robot;

    public RobotPart() {
        turnOff();
        detachRobot();
    }

    public void turnOn() {
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }

    public void attachTo(String robot) {
        this.attached_robot = new String(robot);
    }

    public void detachRobot() {
        this.attached_robot = null;
    }

    public boolean isAttached() {
        return this.attached_robot==null ? false : true; 
    }
}
