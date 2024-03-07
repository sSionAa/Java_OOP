package Java_OOP;

import Java_OOP.Persons;

import java.util.ArrayList;

public class Magician extends Persons {
    public Magician(String name,int x, int y, String nameTeam){
        super(x,y,name, nameTeam,"Human", 60, 60, 10, 10, 10, 3, 1, "Wand");

    }
//     @Override
//     public void getStep(ArrayList<Persons> team) {
//     }

// }

    @Override
    public void getStep(ArrayList<Persons> team, ArrayList<Persons> friends) {

    }
    public  String getInfo(){
        return "Маг";
    }
}
