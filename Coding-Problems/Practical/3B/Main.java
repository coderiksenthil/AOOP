public class Main {
    public static void main(String[] args) {
        // Create music sources
        MusicSource localFileSource = new LocalFileAdapter(new LocalFile("song.mp3"));
        MusicSource streamingSource = new OnlineStreamingAdapter(new OnlineStreamingService());

        // Create playback objects
        PlaybackInterface localPlayback = new Playback(localFileSource);
        PlaybackInterface streamingPlayback = new Playback(streamingSource);

        // Decorate with equalizer and volume control
        PlaybackInterface localPlaybackWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(localPlayback));
        PlaybackInterface streamingPlaybackWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(streamingPlayback));

        // Test playback
        System.out.println("Local Playback:");
        localPlaybackWithFeatures.play();
        localPlaybackWithFeatures.pause();
        localPlaybackWithFeatures.stop();

        System.out.println("\nStreaming Playback:");
        streamingPlaybackWithFeatures.play();
        streamingPlaybackWithFeatures.pause();
        streamingPlaybackWithFeatures.stop();
    }
}
