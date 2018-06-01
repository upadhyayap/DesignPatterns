package design.structural.adapter;

/**
 * Created by anandu on 16/6/16.
 */
public class Mp4 implements AdvanceMediaPlayer {
    @Override
    public void playVlc() {
        // i do not know how to play Vlc
    }

    @Override
    public void playMp4(){
        System.out.println("Playing Mp4");
    }
}
