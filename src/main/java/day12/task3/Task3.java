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

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){  //если честно не совсем понял суть создания этого метода, но сделал так как понял
        String[] groups = {"Animals as Leaders", "Axxis", "AqME", "Art Brut", "Apocalyptica", "Arditi", "Back-On", "Bag Raiders", "Beastie Boys", "Art deco"};

        for(int i = 0; i < bands.size(); i++) {
            bands.get(i).setName(groups[i]);
            if(bands.get(i).getYear() < 2000) bands.get(i).setYear(2000 + i);
        }
        return bands;
    }
}
