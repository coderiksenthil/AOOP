// LocalFileMusicSourceAdapter.java
public class LocalFileMusicSourceAdapter implements MusicSourceAdapter {
    private LocalFileMusicSource localFileMusicSource;

    public LocalFileMusicSourceAdapter(LocalFileMusicSource localFileMusicSource) {
        this.localFileMusicSource = localFileMusicSource;
    }

    @Override
    public void playMusic() {
        localFileMusicSource.play();
    }

    @Override
    public void stopMusic() {
        localFileMusicSource.stop();
    }
}
