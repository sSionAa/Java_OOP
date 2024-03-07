package Persons.Helpers;



public class Peasant extends Helpers{
    public Peasant(String name, int x, int y, String nameTeam) {
        super(name, x, y, nameTeam);
    }

    public  String getInfo(){
        return "Фермер";
    }
}
