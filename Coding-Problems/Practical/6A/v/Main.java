package v;

public class Main {
    public static void main(String[] args) {
        LinkedListPlaylist playlist = new LinkedListPlaylist();

        Song song1 = new Song("Happy", "Pharrell Williams");
        Song song2 = new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars");
        Song song3 = new Song("Can't Stop the Feeling!", "Justin Timberlake");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        System.out.println("Initial Playlist:");
        playlist.displayPlaylist();

        playlist.removeSong("Uptown Funk");
        System.out.println("\nPlaylist after removing 'Uptown Funk':");
        playlist.displayPlaylist();

        playlist.moveSong("Can't Stop the Feeling!", 1);
        System.out.println("\nPlaylist after moving 'Can't Stop the Feeling!' to position 1:");
        playlist.displayPlaylist();
    }
}