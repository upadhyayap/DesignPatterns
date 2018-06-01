package design.creational.builder;

/**
 * Created by anandu on 16/6/16.
 */
public interface RobotPlan {

    public void setRobotHead(String head);

    public void setRobotTorso(String torso);

    public void setRobotArms(String arms);

    public void setRobotLegs(String legs);
}
