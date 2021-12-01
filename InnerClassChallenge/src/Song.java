public class Song {
    private String title;
    private int durationSeconds;

    public Song(String title, int durationSeconds) {
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void printSong() {
        System.out.println(getTitle() + " .......... " + formatSeconds(getDurationSeconds()));
    }

    private String formatSeconds(int duration) {
        int min = duration / 60;
        int sec = duration % 60;
        return (min + ":" + ((sec < 10) ? "0" + sec : sec));
    }
}
