package design.structural.adapter;

/**
 * Created by anandu on 16/6/16.
 */
public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc() {
        System.out.println("Playing Vlc");
    }

    @Override
    public void playMp4(){
        // i do not know how to play mp4
    }

}
