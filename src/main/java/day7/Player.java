package day7;

public class Player {
    private int stamina;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if(Player.countPlayers < 6) Player.countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        if(stamina > MIN_STAMINA){
            stamina--;
            if(stamina == MIN_STAMINA) countPlayers--;
        }
    }

    public void info(){
        if(countPlayers < 6){
            int i = 6 - countPlayers;
            System.out.printf("Команды неполные. На поле еще есть %d %s" , i, getString(i));
        } else System.out.println("На поле нет свободных мест");
    }

    private String getString(int i){
        String s;
        switch (i){
            case (1):
                s = "свободное место";
                break;
            case (2):
            case (3):
            case (4):
                s = "свободных места";
                break;
            case (5):
            case (6):
                s = "свободных мест";
                break;
            default: s = "свободных мест(а)";
            break;
        }
        return s;
    }

}
