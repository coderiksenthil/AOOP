// TV class
class TV {
    public void turnOn() {
        System.out.println("TV is turned on.");
    }

    public void turnOff() {
        System.out.println("TV is turned off.");
    }

    public void setInputChannel(String channel) {
        System.out.println("TV input set to " + channel + ".");
    }
}

// SoundSystem class
class SoundSystem {
    public void turnOn() {
        System.out.println("Sound System is turned on.");
    }

    public void turnOff() {
        System.out.println("Sound System is turned off.");
    }

    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume + ".");
    }
}

// DVDPlayer class
class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD Player is turned on.");
    }

    public void turnOff() {
        System.out.println("DVD Player is turned off.");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie + " on DVD Player.");
    }
}

// HomeTheaterFacade class
class HomeTheaterFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch a movie...");
        tv.turnOn();
        tv.setInputChannel("HDMI 1");
        soundSystem.turnOn();
        soundSystem.setVolume(20);
        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movie);
        System.out.println("Movie is ready to watch. Enjoy!");
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.turnOff();
        soundSystem.turnOff();
        tv.turnOff();
        System.out.println("Home theater is shut down.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        //subsystems
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();

        //facade 
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, dvdPlayer);

        // facade to watch a movie
        homeTheater.watchMovie("Inception");

        // End the movie and shut down the system
        homeTheater.endMovie();
    }
}
