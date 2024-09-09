// RadioStationMusicSource.java
public class RadioStationMusicSource implements MusicSource {
    private String stationName;

    public RadioStationMusicSource(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void play() {
        System.out.println("Playing radio station: " + stationName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping radio station: " + stationName);
    }
}