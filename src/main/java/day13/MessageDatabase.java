package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        String user1 = u1.getUserName();
        String user2 = u2.getUserName();
        for(Message message : messages){
            String sendName = message.getSender().getUserName();
            String recName = message.getReceiver().getUserName();
            if((user1.equals(sendName) || user1.equals(recName))
                    && (user2.equals(sendName) || user2.equals(recName))){
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}
