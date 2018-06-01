package design.structural.adapter;

/**
 * Created by anandu on 16/6/16.
 */
public class MediaAdapter {
    AdvanceMediaPlayer advancePlayer;

    public MediaAdapter(String type){
        if (type.equalsIgnoreCase("vlc")) {
            advancePlayer = new VlcPlayer();
        }
        else if (type.equalsIgnoreCase("mp4")){
            advancePlayer = new Mp4();
        }
    }

    public void play(String fileName,String type){
        if (type.equalsIgnoreCase("vlc")){
            advancePlayer.playVlc();
        }
        else if (type.equalsIgnoreCase("mp4")){
            advancePlayer.playMp4();
        }
    }
}
