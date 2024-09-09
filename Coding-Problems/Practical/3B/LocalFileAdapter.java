public class LocalFileAdapter implements MusicSource {
    private LocalFile localFile;

    public LocalFileAdapter(LocalFile localFile) {
        this.localFile = localFile;
    }

    @Override
    public void play() {
        localFile.playFile();
    }

    @Override
    public void pause() {
        System.out.println("Pausing local file");
    }

    @Override
    public void stop() {
        localFile.stopFile();
    }
}
