package users;

public class User {
    public str name;
    public str email;
    public str restrains;
    public User match;

    public User(str userName, str userEmail, str restrains){
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

    public str getName(){
        return this.name;
    }
    public str getEmail(){
        return this.email;
    }

    public str getRestrains(){
        return this.restrains;
    }
}
