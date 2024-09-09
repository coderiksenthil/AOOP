public class OnlineMusicSource implements MusicSource {
    private String url;

    public OnlineMusicSource(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Streaming music from URL: " + url);
    }

    @Override
    public void stop() {
        System.out.println("Stopping music stream from URL: " + url);
    }
}
