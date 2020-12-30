package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Player player = new Player(random());
        Player player1 = new Player(random());
        Player player2 = new Player(random());
        Player player3 = new Player(random());
        Player player4 = new Player(random());
        Player player5 = new Player(random());
        Player player6 = new Player(random());
        int s = player.getStamina();
        for(int i = 0; i < s; i++) player.run();
        player.info();
    }

    public static int random(){
       return (int) ((Math.random() * ((100 - 90) + 1)) + 90);
    }
}
