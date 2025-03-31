package interfaces.mediaplayer;

public class VideoPlayer implements MediaPlayer {
    @Override
    public void pause() {
        System.out.println("Pausing video...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video...");
    }

    @Override
    public void play() {
        System.out.println("Playing video...");
    }
}
