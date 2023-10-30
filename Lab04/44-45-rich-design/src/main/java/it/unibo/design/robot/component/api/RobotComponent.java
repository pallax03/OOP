package it.unibo.design.robot.component.api;

public interface RobotComponent {
    public void turnOn();
    public void turnOff();
    void attachTo(String robot);
    public void detachRobot();
    public boolean isAttached();
}
