// MusicSourceDecorator.java
public abstract class MusicSourceDecorator implements MusicSource {
    protected MusicSource decoratedMusicSource;

    public MusicSourceDecorator(MusicSource decoratedMusicSource) {
        this.decoratedMusicSource = decoratedMusicSource;
    }

    @Override
    public void play() {
        decoratedMusicSource.play();
    }

    @Override
    public void stop() {
        decoratedMusicSource.stop();
    }
}