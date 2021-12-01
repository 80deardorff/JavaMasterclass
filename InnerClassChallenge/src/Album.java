import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public boolean addSong(String songTitle, int durationSeconds) {
        return songs.add(new Song(songTitle, durationSeconds));
    }

    public boolean removeSong(String songTitle) {
        return songs.remove(songs.getSong(songTitle));
    }

    public void printAlbumSongs() {
        System.out.println("-----Album Songs-----");
        for (Song song : this.songs.songsList) {
            song.printSong();
        }
        System.out.println();
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        Song checkedSong = songs.getSong(index);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track number " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String songTitle, List<Song> playlist) {
        Song checkedSong = this.songs.getSong(songTitle);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track named " + songTitle);
        return false;
    }



    private class SongList {
        private ArrayList<Song> songsList;

        public SongList() {
            this.songsList = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songsList.contains(song)) {
                return false;
            }
            this.songsList.add(song);
            return true;
        }

        public boolean remove(Song song) {
            if (!songsList.contains(song)) {
                return false;
            }
            this.songsList.remove(song);
            return true;
        }

        private Song getSong(String songTitle) {
            int index = getSongIndex(songTitle);
            if (index >= 0) {
                return this.songsList.get(index);
            }
            return null;
        }

        private Song getSong(int index) {
            if (index >= 0 && index < songsList.size()) {
                return this.songsList.get(index);
            }
            return null;
        }

        private int getSongIndex(String songTitle) {
            for (int i = 0; i < this.songsList.size(); i++) {
                if (this.songsList.get(i).getTitle().equals(songTitle)) {
                    return i;
                }
            }
            return -1;
        }
    }












}
