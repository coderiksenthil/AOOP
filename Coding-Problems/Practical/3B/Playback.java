public class Playback implements PlaybackInterface {
    private MusicSource musicSource;

    public Playback(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play();
    }

    @Override
    public void pause() {
        musicSource.pause();
    }

    @Override
    public void stop() {
        musicSource.stop();
    }
}
