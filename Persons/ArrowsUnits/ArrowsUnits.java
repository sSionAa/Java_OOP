package Java_OOP;

import java.util.ArrayList;

public class Sniper extends Persons{
    protected int arrows;
    public Sniper(String name, int x, int y, String nameTeam, int arrows){
        super(name, new Place(x,y), nameTeam,"Goblin", 20, 20, 5, 1, 5, 5, 1, "Sniper");
    this.arrows=arrows;
    }

    public void getStep(ArrayList<Persons> enemy, ArrayList<Persons> friend) {
        Persons target = super.getMinDistance(enemy);
        if (target==null) return;
        if (getHealth() > 0) {
            if (this.getArrows() > 0) {
                this.toAttack(target);
                for(Persons unit: friend){
                    if (unit.getInfo().equals("Фермер")&&!((Peasant)unit).flag) {
                        ((Peasant)unit).flag=true;
                        return;
                    }
                }
                this.arrows--;

            }
        }
    }

//    @Override
//    public void getStep(ArrayList<Persons> enemy, ArrayList<Persons> friend) {
//        if ((health <= 0) || (arrows == 0)) return;
//        Persons target = super.getMinDistance(enemy);
//        target.toAttack(this);
//        arrows--;
//    }
    private void setArrows(int arrows) {
        this.arrows = arrows;
    }
    private int getArrows() {
        return this.arrows;
    }
    @Override
    public String toString() {
        return super.toString()+" \u27b6" + this.arrows;
    }
    public  String getInfo(){
        return "Стрелок";
    }
}
