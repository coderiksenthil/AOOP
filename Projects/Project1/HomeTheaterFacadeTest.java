import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class HomeTheaterFacadeTest {

    private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;
    private HomeTheaterFacade homeTheater;

    @Before
    public void setUp() {
        // Create mock objects for the subsystems
        tv = mock(TV.class);
        soundSystem = mock(SoundSystem.class);
        dvdPlayer = mock(DVDPlayer.class);

        // Create the facade with the mock subsystems
        homeTheater = new HomeTheaterFacade(tv, soundSystem, dvdPlayer);
    }

    @Test
    public void testWatchMovie() {
        String movie = "Inception";

        // Call the method
        homeTheater.watchMovie(movie);

        // Verify interactions with the subsystems
        verify(tv).turnOn();
        verify(tv).setInputChannel("HDMI 1");
        verify(soundSystem).turnOn();
        verify(soundSystem).setVolume(20);
        verify(dvdPlayer).turnOn();
        verify(dvdPlayer).playMovie(movie);
    }

    @Test
    public void testEndMovie() {
        // Call the method
        homeTheater.endMovie();

        // Verify interactions with the subsystems
        verify(dvdPlayer).turnOff();
        verify(soundSystem).turnOff();
        verify(tv).turnOff();
    }
}
