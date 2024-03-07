package Persons.Helpers;

import Java_OOP.Persons;
import Java_OOP.Place;

import java.util.ArrayList;

public abstract class Helpers extends Persons {

    public boolean flag;
    protected int arrows;

    public Helpers(String name,int x, int y, String nameTeam){
        super(name, new Place(x,y), nameTeam,"Human", 20, 20, 2, 0, 1, 1, 1, "Axe");;
        flag=false;
        arrows=10;
    }

    @Override
    public void getStep(ArrayList<Persons> team, ArrayList<Persons> friend) {
        if (health<=0) return;
        flag=false;

    }

}
