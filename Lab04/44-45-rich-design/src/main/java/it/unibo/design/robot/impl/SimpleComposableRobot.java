package it.unibo.design.robot.impl;

import java.util.List;

import it.unibo.design.robot.api.ComposableRobot;
import it.unibo.design.robot.component.api.RobotComponent;

public class SimpleComposableRobot extends BaseRobot implements ComposableRobot{
    List<RobotComponent> parts;

    public SimpleComposableRobot(String robotName) {
        super(robotName);
        parts = null;
    }

    @Override
    public void attachComponent(RobotComponent part) {
        parts.add(part);
    }

    @Override
    public void doCycle() {
        throw new UnsupportedOperationException("Unimplemented method 'doCycle'");
    }

    @Override
    public void detachComponent(RobotComponent part) {
        parts.remove(part);
    }

}
