package day13;

import java.util.*;

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
        return subs.contains(user);
    }

    public boolean isFriend(User user){
        return subs.contains(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString(){
        return "Username " + userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(subs, user.subs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, subs);
    }


}
