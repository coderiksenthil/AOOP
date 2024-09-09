public class EqualizerDecorator extends PlaybackDecorator {
    public EqualizerDecorator(PlaybackInterface decoratedPlayback) {
        super(decoratedPlayback);
    }

    public void setEqualizer(String setting) {
        System.out.println("Setting equalizer to: " + setting);
    }

    @Override
    public void play() {
        super.play();
        setEqualizer("Default");
    }
}
