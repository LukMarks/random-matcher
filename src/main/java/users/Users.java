package users;

public class Users {
    public str name;
    public str email;
    public str restrains;
    public Users match;

    public Users(str userName, str userEmail, str restrains){
        this.name = userName;
        this.email = userEmail;
        this.restrains = restrains;
    }

    public void SetMatch(Users userMatch){
        this.match = userMatch;
    }

    public Users getMatch(){
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
