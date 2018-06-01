package design.structural.adapter;

/**It makes incompatiable interfaces two work togather.
 * MediaPlayer Interface has only play contract but does not offer to play vlc or mp4.
 * which intern Advance Media player has that capability. So the idea is how do we make
 * Audio player to which is concrete of media player to also play vlc using Advance media player's
 * offering to play some more files.
 * Used mostly when we want to add some more functionality to an existing class and it's interface does not
 * matches that.
 *
 * Created by anandu on 16/6/16.
 */
public class Demo {

    public static void main(String args[]) {
        MediaPlayer player = new AudioPlayer();
        player.play("wave.vlc", "vlc");
        player.play("wave.mp4", "mp4");
    }

}
