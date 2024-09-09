package v;

public interface Playlist {
    void addSong(Song song);
    void removeSong(String songTitle);
    void moveSong(String songTitle, int newPosition);
    void displayPlaylist();
}