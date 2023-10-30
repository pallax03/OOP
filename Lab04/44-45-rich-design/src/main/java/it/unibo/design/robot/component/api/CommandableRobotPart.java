package it.unibo.design.robot.component.api;

public abstract class CommandableRobotPart extends RobotPart {
    private String[] commands; 

    public CommandableRobotPart() {
        commands = null;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String[] availableCommands() {
        return this.commands;
    }

    public abstract void sendCommand(String command);
}
