public abstract class PlaybackDecorator implements PlaybackInterface {
    protected PlaybackInterface decoratedPlayback;

    public PlaybackDecorator(PlaybackInterface decoratedPlayback) {
        this.decoratedPlayback = decoratedPlayback;
    }

    @Override
    public void play() {
        decoratedPlayback.play();
    }

    @Override
    public void pause() {
        decoratedPlayback.pause();
    }

    @Override
    public void stop() {
        decoratedPlayback.stop();
    }
}
