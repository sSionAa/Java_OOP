package Persons.Healers;

import Persons.Infantry.Infantry;
public class Magician extends Infantry {

    public Magician(String name, int x, int y, String nameTeam) {
        super(name, x, y, nameTeam);
    }
    public  String getInfo(){
        return "Маг";
    }
}
