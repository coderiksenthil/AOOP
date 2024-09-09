// VolumeControlDecorator.java
public class VolumeControlDecorator extends MusicSourceDecorator {
    private int volumeLevel;

    public VolumeControlDecorator(MusicSource decoratedMusicSource, int volumeLevel) {
        super(decoratedMusicSource);
        this.volumeLevel = volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
        System.out.println("Setting volume level: " + volumeLevel);
    }

    @Override
    public void play() {
        setVolumeLevel(volumeLevel);
        super.play();
    }
}