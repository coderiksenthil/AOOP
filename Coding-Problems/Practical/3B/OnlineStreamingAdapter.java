public class OnlineStreamingAdapter implements MusicSource {
    private OnlineStreamingService streamingService;

    public OnlineStreamingAdapter(OnlineStreamingService streamingService) {
        this.streamingService = streamingService;
    }

    @Override
    public void play() {
        streamingService.playStream();
    }

    @Override
    public void pause() {
        System.out.println("Pausing online stream");
    }

    @Override
    public void stop() {
        streamingService.stopStream();
    }
}
