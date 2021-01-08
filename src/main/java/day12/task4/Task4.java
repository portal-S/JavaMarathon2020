package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("First", 1991, "Freddie Mercury", "Travis Scott", "Sub Urban");
        MusicBand musicBand2 = new MusicBand("Second", 1997, "Trevor Daniel", "Lana Del Rey", "Ed Sheeran");
        musicBand.printMembers();
        System.out.println("-----------");
        musicBand2.printMembers();
        System.out.println("-----------");
        MusicBand.transferMembers(musicBand, musicBand2);
        musicBand.printMembers();
    }
}
