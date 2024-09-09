// LocalFileMusicSource.java
public class LocalFileMusicSource implements MusicSource {
    private String filePath;

    public LocalFileMusicSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void play() {
        System.out.println("Playing music from local file: " + filePath);
    }

    @Override
    public void stop() {
        System.out.println("Stopping music from local file: " + filePath);
    }
}
