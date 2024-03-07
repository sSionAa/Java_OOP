package Persons.ArrowsUnits;

import Persons.ArrowsUnits.ArrowsUnits;

public class Crossbowman extends ArrowsUnits {
    public Crossbowman(String name, int x, int y, String nameTeam, int arrows) {
        super(name, x, y, nameTeam, arrows);
    }


    public String getInfo() {
        return "Арбалетчик";
    }

}
