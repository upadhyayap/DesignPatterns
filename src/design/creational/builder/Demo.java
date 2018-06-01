package design.creational.builder;

/**It decouples object construction and with it's representation so that same
 * construction process can be used again and again.
 * We use it when object construction process gets complex and we do not want to
 * expose all the complex details to the client.In that case builder knows which
 * object to inject for creating another object for which the builder is intended for.
 * Created by anandu on 14/6/16.
 */
public class Demo {

    public static void main(String[] args){

        // Get a RobotBuilder of type OldRobotBuilder

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        // Pass the OldRobotBuilder specification to the engineer

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        // Tell the engineer to make the Robot using the specifications
        // of the OldRobotBuilder class

        robotEngineer.makeRobot();

        // The engineer returns the right robot based off of the spec
        // sent to it on line 11

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");

        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());

        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());

        System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());

        System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());

    }

}
