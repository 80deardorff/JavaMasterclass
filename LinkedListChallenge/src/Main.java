import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();
    private static List<Song> playlist = new LinkedList<Song>();

    public static void main(String[] args) {
        Album album = new Album("Thriller", "Michael Jackson");
        album.addSong("Wanna Be Startin' Somethin'", 363);
        album.addSong("Baby Be Mine", 260);
        album.addSong("The Girl Is Mine", 222);
        album.addSong("Thriller", 358);
        album.addSong("Beat It", 258);
        album.addSong("Billie Jean", 294);
        album.addSong("Human Nature", 246);
        album.addSong("P.Y.T (Pretty Young Thing)", 239);
        album.addSong("The Lady in My Life", 299);
        albums.add(album);

        album = new Album("Bad", "Michael Jackson");
        album.addSong("Bad", 248);
        album.addSong("The Way You Make Me Feel", 299);
        album.addSong("Speed Demon", 243);
        albums.add(album);

        album = new Album("Off the Wall", "Michael Jackson");
        album.addSong("Don't Stop 'Til You Get Enough", 365);
        album.addSong("Rock With You", 218);
        album.addSong("Workin' Day and Night", 314);
        albums.add(album);

        albums.get(0).addToPlaylist(1, playlist);
        albums.get(2).addToPlaylist(3, playlist);
        albums.get(2).addToPlaylist(1, playlist);
        albums.get(0).addToPlaylist(2, playlist);
        albums.get(0).addToPlaylist(3, playlist);
        albums.get(0).addToPlaylist(4, playlist);
        albums.get(0).addToPlaylist(5, playlist);
        albums.get(0).addToPlaylist(6, playlist);

        play(playlist);
    }

    private static void play(List<Song> playlist) {
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        }
        System.out.print("Now playing --> ");
        listIterator.next().printSong();
        boolean quit = false;
        boolean isForward = true;
        while (!quit) {
            char choice = getInput();
            switch (Character.toUpperCase(choice)) {
                case 'Q':
                    System.out.println("Playlist ended.");
                    quit = true;
                    break;
                case 'S':
                    printPlaylist();
                    break;
                case 'N':
                    if (!isForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        isForward = true;
                        }
                    if (listIterator.hasNext()) {
                        System.out.print("Now playing --> ");
                        listIterator.next().printSong();
                    } else {
                        System.out.println("You have reached the end of playlist");
                    }
                    break;
                case 'P':
                    if (isForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        isForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.print("Now playing --> ");
                        listIterator.previous().printSong();
                    } else {
                        System.out.println("You have reached the beginning of playlist");
                    }
                    break;
                case 'R':
                    if (isForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.print("Now playing --> ");
                        listIterator.next().printSong();
                    }
                    break;
                case 'D':
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.print("Now playing --> ");
                            listIterator.next().printSong();
                        } else if (listIterator.hasPrevious()){
                            System.out.print("Now playing --> ");
                            listIterator.previous().printSong();
                        }
                    } else {
                        System.out.println("There are no songs in the playlist.");
                    }
                    break;
                case 'M':
                    printMenu();
                    break;
                default:
                    System.out.println("Sorry, that is not a valid menu option. Try again...");
            }
        }
    }

    private static void printMenu() {
        System.out.println("-----Menu Options-----");
        System.out.println("[Q] - Quit Application");
        System.out.println("[S] - Print Playlist of Songs");
        System.out.println("[N] - Next Song");
        System.out.println("[P] - Previous Song");
        System.out.println("[R] - Replay Song");
        System.out.println("[D] - Delete Current Song From Playlist");
        System.out.println("[M] - Show Menu Options");
    }

    private static char getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter option from menu (press M to show menu options): ");
        char input = scanner.next().charAt(0);
        scanner.nextLine();
        return input;
    }

    private static void printPlaylist() {
        System.out.println("-----Playlist Songs-----");
        for (Song song : playlist) {
            song.printSong();
        }
        System.out.println();
    }
}
