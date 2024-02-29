package Java_OOP;

import Java_OOP.Persons;
import java.util.ArrayList;

public class Peasant extends Persons {
    public Peasant(String name,int x, int y, String nameTeam){
        super(x,y,name, nameTeam,"Human", 30, 30, 5, 0, 1, 2, 1, "Axe");

    }
    // @Override
    // public void getStep(ArrayList<Persons> team) {

    // }
    @Override
    public void getStep(ArrayList<Persons> team, ArrayList<Persons> friend) {

    }
    public  String getInfo(){
        return "Фермер";
    }
}

