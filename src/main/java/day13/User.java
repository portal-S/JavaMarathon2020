package day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private String userName;
    private Set<User> subs;

    public User(String userName) {
        this.userName = userName;
        this.subs = new HashSet<>();
    }

    public String getUserName() {
        return userName;
    }

    public Set<User> getSubs() {
        return subs;
    }

    public void subscribe(User user){
        subs.add(user);
    }

    public boolean isSubscribed(User user){
        if(subs.contains(user)) return true;
        return false;
    }

    public boolean isFriend(User user){
        if(subs.contains(user) && user.isSubscribed(this)) return true;
        return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString(){
        return "Username " + userName;
    }


}
