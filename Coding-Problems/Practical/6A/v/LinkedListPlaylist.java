package v;

import java.util.LinkedList;

public class LinkedListPlaylist implements Playlist {
    private LinkedList<Song> playlist;

    public LinkedListPlaylist() {
        this.playlist = new LinkedList<>();
    }

    @Override
    public void addSong(Song song) {
        playlist.add(song);
    }

    @Override
    public void removeSong(String songTitle) {
        for (Song song : playlist) {
            if (song.getTitle().equals(songTitle)) {
                playlist.remove(song);
                return;
            }
        }
    }

    @Override
    public void moveSong(String songTitle, int newPosition) {
        Song songToMove = null;
        for (Song song : playlist) {
            if (song.getTitle().equals(songTitle)) {
                songToMove = song;
                break;
            }
        }
        if (songToMove != null) {
            playlist.remove(songToMove);
            playlist.add(newPosition, songToMove);
        }
    }

    @Override
    public void displayPlaylist() {
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }
    }
}