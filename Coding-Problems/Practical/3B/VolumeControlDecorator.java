public class VolumeControlDecorator extends PlaybackDecorator {
    public VolumeControlDecorator(PlaybackInterface decoratedPlayback) {
        super(decoratedPlayback);
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to: " + level);
    }

    @Override
    public void play() {
        super.play();
        setVolume(50);
    }
}
