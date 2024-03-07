package Persons.Healers;

import Java_OOP.Persons;
import Java_OOP.Place;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Healers extends Persons {
    int mana;
    public Healers(String name, int x, int y, String nameTeam){
        super(name, new Place(x,y),nameTeam,"Human",20, 20, 2, 10, 3, 1, 1, "Stick");
        mana=10;
    }

    @Override
    public void getStep(ArrayList<Persons> team, ArrayList<Persons> friend) {
        if (getHealth()<=0) return;
        if (mana <=2){
            mana++;
            return;
        }
        ArrayList<Persons> sortedlist = new ArrayList<>(friend);
        ArrayList<Persons> deadlist = new ArrayList<>(friend);
        sortedlist.sort((Comparator.comparingInt(Persons::getHealth)));
        int countdead =0;
        for (Persons persons : sortedlist) {
            if (persons.getHealth()==0) {
                deadlist.add(persons);
                countdead++;}
        }
        if (countdead>=3){
            if (mana<10){
                mana++;
                return;
            }
            else{
                deadlist.sort(((o1, o2) -> o2.getSpeeed() - o1.getSpeeed()));
                deadlist.getFirst().setHealth(getMaxHealth());
                mana=0;
                System.out.println("Воскресил: " + deadlist.getFirst().getInfo());
                return;
            }
        }
        sortedlist.getFirst().setHealth(10);
        mana-=2;
    }
}
