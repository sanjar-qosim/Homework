package interfaces.mediaplayer;

public interface Playable {
    void play();
    default void voiceEnc(){
        System.out.println("The volume has been raised ");
    }
    default void voiceDec(){
        System.out.println("The volume has been lowered");
    }
}
