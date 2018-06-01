package design.creational.builder;

/**
 * Created by anandu on 16/6/16.
 */
// Defines the methods needed for creating parts
// for the robot

public interface RobotBuilder {

    public void buildRobotHead();

    public void buildRobotTorso();

    public void buildRobotArms();

    public void buildRobotLegs();

    public Robot getRobot();

}
