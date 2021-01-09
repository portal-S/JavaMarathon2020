package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("portalsam");
        User user2 = new User("DreamSmoke");
        User user3 = new User("Lingerok");

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Чем занимаешься?");

        user2.sendMessage(user1, "Здарова");
        user2.sendMessage(user1, "Вот тут за компом сижу");
        user2.sendMessage(user1, "А ты?");

        user3.sendMessage(user1, "Дарова бандит");
        user3.sendMessage(user1, "Займи бабок");
        user3.sendMessage(user1, "До среды");

        user1.sendMessage(user3, "Привет");
        user1.sendMessage(user3, "Ты мне ещё прошлый долг уже год как вернуть не можешь");
        user1.sendMessage(user3, "Кстати, когда вернёшь?");

        user3.sendMessage(user1, "'Был в сети 5 минут назад'");

        MessageDatabase.showDialog(user1, user3);
    }
}
