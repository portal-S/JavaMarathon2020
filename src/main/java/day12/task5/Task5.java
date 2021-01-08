package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("First", 1991, new MusicArtist("Freddie Mercury", 43), new MusicArtist("Travis Scott", 42), new MusicArtist("Sub Urban", 32));
        MusicBand musicBand2 = new MusicBand("Second", 1997, new MusicArtist("Trevor Daniel", 35), new MusicArtist("Lana Del Rey", 36), new MusicArtist("Ed Sheeran", 37));
        musicBand.printMembers();
        System.out.println("-----------");
        musicBand2.printMembers();
        System.out.println("-----------");
        MusicBand.transferMembers(musicBand, musicBand2);
        musicBand.printMembers();

    }
}
