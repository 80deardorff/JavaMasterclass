package com.company;

import com.company.model.Artist;
import com.company.model.Datasource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
        }

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_NONE);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Pink Floyd", Datasource.ORDER_BY_DESC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }
        datasource.close();
    }
}
