package day12.task4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MusicBand {
    private String name;
    private int year;
    private Set<String> members = new HashSet<>();

    public MusicBand(String name, int year, String ... user) {
        this.name = name;
        this.year = year;
        for(int i = 0; i < user.length; i++) members.add(user[i]);
    }

    public static void transferMembers(MusicBand mb1, MusicBand mb2){
        mb1.getMembers().addAll(mb2.getMembers());
    }

    public void memberAdd(String member) {
        members.add(member);
    }

    public void memberRemove(String member) {
        members.remove(member);
    }

    public void printMembers(){
        for(String member : members) System.out.println(member);
    }

    public Set<String> getMembers(){
        return members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
