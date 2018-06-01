package design.structural.adapter;

/**
 * Created by anandu on 16/6/16.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;
    @Override
    public void play(String fileName, String type){
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3");

        }
        else {
            adapter = new MediaAdapter(type);
            adapter.play(fileName, type);
        }
    }

}
