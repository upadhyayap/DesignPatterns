package design.structural.bridge;

/**Good code can be changed without breaking and abstraction allows us to
 * do that.
 *This pattern let the abstraction and implementation vary independently.
 * In this example entertainment and remote control can vary independently.
 * Created by anandu on 16/6/16.
 */
public class Demo {
    public static void main(String[] args){

        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));

        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));

        RemoteButton theDVD = new DVDRemote(new DVDDevice(1,14));

        System.out.println("Test TV with Mute");

        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("\nTest TV with Pause");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();

        System.out.println("\nTest DVD");

        theDVD.buttonFivePressed();
        theDVD.buttonSixPressed();
        theDVD.buttonNinePressed();
        theDVD.buttonNinePressed();

    }
}
