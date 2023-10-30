package it.unibo.design.robot.api;

import it.unibo.design.robot.component.api.RobotComponent;

public interface ComposableRobot extends Robot{
    void attachComponent(RobotComponent part);
    void doCycle();
    void detachComponent(RobotComponent part);
}
