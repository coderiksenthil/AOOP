// EqualizerDecorator.java
public class EqualizerDecorator extends MusicSourceDecorator {
    public EqualizerDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    public void setEqualizerSettings(String settings) {
        System.out.println("Setting equalizer settings: " + settings);
    }

    @Override
    public void play() {
        super.play();
        setEqualizerSettings("Default");
    }
}