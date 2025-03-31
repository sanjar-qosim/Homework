package interfaces.mediaplayer;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void pause() {
        System.out.println("Pausing audio...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio...");
    }

    @Override
    public void play() {
         System.out.println("Playing audio...");
    }
}
