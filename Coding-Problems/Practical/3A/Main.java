public class Main {
    public static void main(String[] args) {
        MusicSource localMusic = new LocalFileMusicSource("song.mp3");
        MusicSource onlineMusic = new OnlineMusicSource("http://example.com/stream");
        
        MusicSource decoratedLocalMusic = new EqualizerDecorator(new VolumeControlDecorator(localMusic, 10));
        MusicSource decoratedOnlineMusic = new VolumeControlDecorator(new EqualizerDecorator(onlineMusic), 5);

        decoratedLocalMusic.play();
        decoratedOnlineMusic.play();
        
        decoratedLocalMusic.stop();
        decoratedOnlineMusic.stop();
    }
}
