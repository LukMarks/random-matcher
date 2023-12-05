package org.userMatcher.user;

public class User {
    public String name;
    public String email;
    public String restrains;
    public User match;

    public User(String userName, String userEmail, String restrains){
        this.name = userName;
        this.email = userEmail;
        this.restrains = restrains;
    }

    public void SetMatch(User userMatch){
        this.match = userMatch;
    }

    public User getMatch(){
        return this.match;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    public String getRestrains(){
        return this.restrains;
    }
}
