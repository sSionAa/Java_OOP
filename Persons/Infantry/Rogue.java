package Persons.Infantry;

public class Rogue extends Infantry {

    public Rogue(String name, int x, int y, String nameTeam) {
        super(name, x, y, nameTeam);
    }


    public  String getInfo(){
        return "Вор";
    }
}
