package designPatterns.adapter;

/*
Adapter pattern works as a bridge between two incompatible interfaces.
This type of design pattern comes under
structural pattern as this pattern combines the capability of two independent interfaces.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");

        audioPlayer.play("mp4", "alone.mp4");

        audioPlayer.play("vlc", "far far way vlc");

    }

}
