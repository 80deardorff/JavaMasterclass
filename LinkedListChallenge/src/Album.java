import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public boolean addSong(String songTitle, int durationSeconds) {
        if (getSong(songTitle) != null) {
            System.out.println("Song creation failed. Song already exists in album.");
            return false;
        }
        Song song = new Song(songTitle, durationSeconds);
        songs.add(song);
        return true;
    }

    public boolean removeSong(String songTitle) {
        int index = getSongIndex(songTitle);
        if (index == -1) {
            System.out.println("Remove song failed. Song does not exist in album.");
            return false;
        }
        songs.remove(index);
        return true;
    }

    public void printAlbumSongs() {
        System.out.println("-----Album Songs-----");
        for (Song song : songs) {
            song.printSong();
        }
        System.out.println();
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < songs.size())) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track number " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String songTitle, List<Song> playlist) {
        Song checkSong = getSong(songTitle);
        if (checkSong != null) {
            playlist.add(checkSong);
            return true;
        }
        System.out.println("This album does not have a track named " + songTitle);
        return false;
    }

    private Song getSong(String songTitle) {
        int index = getSongIndex(songTitle);
        if (index >= 0) {
            return songs.get(index);
        }
        return null;
    }

    private int getSongIndex(String songTitle) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(songTitle)) {
                return i;
            }
        }
        return -1;
    }
}
