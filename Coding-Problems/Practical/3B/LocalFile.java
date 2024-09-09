public class LocalFile {
    private String filename;

    public LocalFile(String filename) {
        this.filename = filename;
    }

    public void playFile() {
        System.out.println("Playing local file: " + filename);
    }

    public void stopFile() {
        System.out.println("Stopping local file");
    }
}
