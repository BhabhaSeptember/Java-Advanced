package ch11;

import java.util.*;

public class Jukebox6 {

    public static void main(String[] args) {
        new Jukebox6().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);

//----- Page 342 Exercise -----

        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println(songList);
               
        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println(songList);

    }
}
