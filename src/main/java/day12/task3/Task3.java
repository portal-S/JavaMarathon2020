package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>(Arrays
                .asList(new MusicBand("AKB48", 1999),
                        new MusicBand("Akcent", 1978),
                        new MusicBand("Alkaline Trio", 1974),
                        new MusicBand("Barcode Brothers", 2005),
                        new MusicBand("Bionic Jive", 1996),
                        new MusicBand("Blind Guardian", 1999),
                        new MusicBand("Blindside", 2001),
                        new MusicBand("Audioslave", 1986),
                        new MusicBand("The Ataris", 1996),
                        new MusicBand("Arditi", 1999)));

        Collections.shuffle(musicBands);

        for (MusicBand mb : musicBands) System.out.println(mb);

        System.out.println("-------------");

        for (MusicBand mb : groupsAfter2000(musicBands)) System.out.println(mb);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bands1 = new ArrayList<>();
        for(MusicBand musicBand : bands){
            if(musicBand.getYear() > 2000) bands1.add(musicBand);
        }
        return bands1;
    }
}
