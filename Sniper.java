package Java_OOP;

import java.util.ArrayList;

public class Sniper extends Persons {
    protected int arrows;
    
    public Sniper(String name, int x, int y, String nameTeam, int arrows){
        super(x,y,name, nameTeam,"Goblin", 60, 30, 6, 1, 8, 5, 1, "Sniper Rifle");
        this.arrows=arrows;
    }
    public void getStep(ArrayList<Persons> team) {
        if (Sniper.this.getHealth() > 0) {
            if (Sniper.this.getArrows() > 0) {
                System.out.println(this.name + " атаковал!");
                toAttack(getMinDistance(team));
                this.arrows--;
                Sniper.this.setArrows(this.arrows);
            } else {
                System.out.println("Give me more arrows!!!");
            }
        }
    }
    private void setArrows(int arrows) {
        this.arrows = arrows;
    }
    private int getArrows() {
        return this.arrows;
    }
    @Override
    public String toString() {
        return "Имя героя: " + this.name+ ", класс: " + getClass().getSimpleName() + "; Команда: " + getNameTeam()
                + "\nПринадлежность героя: " + this.race + "; Текущее состояние здоровья: " + this.health+ "; Стрелы: " + getArrows()
                + "; Координаты (" + pos.X + " : " + pos.Y + ")"+ "; Приоритет: " + getSpeeed()
                + "\n"+"-".repeat(20);
    }

}

