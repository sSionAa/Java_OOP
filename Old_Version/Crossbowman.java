package Java_OOP;

import java.util.ArrayList;
import java.util.List;

public class Crossbowman extends Persons {
    protected int arrows;
    
    public Crossbowman(String name, int x, int y, String nameTeam, int arrows){
        super(x, y, name, nameTeam, "Elf", 30, 30, 8, 5, 1, 5, 1, "Crossbow");
        this.arrows = arrows;
    }

    public void getStep(ArrayList<Persons> enemy, ArrayList<Persons> friend) {

        if (getHealth() > 0) {
            if (this.getArrows() > 0) {
                this.toAttack(getMinDistance(enemy));
                this.arrows--;

            }
        }
    }
    
    // public void getStep(ArrayList<Persons> team) {
    //         if (Crossbowman.this.getHealth() > 0) {
    //             if (Crossbowman.this.getArrows() > 0) {
    //                 System.out.println(this.name + " атаковал!");
    //                 toAttack(getMinDistance(team));
    //                 this.arrows--;
    //                 Crossbowman.this.setArrows(this.arrows);
    //             } else {
    //                 System.out.println("Give me more arrows!!!");
    //             }
    //         }
    //     }
    
        private void setArrows(int arrows) {
            this.arrows = arrows;
        }
    
        private int getArrows() {
            return this.arrows;
        }
    
    //     @Override
    //     public String toString() {
    //         return "Имя героя: " + getName() + ", класс: " + getClass().getSimpleName() + "; Команда: " + getNameTeam()
    //                 + "\nПринадлежность героя: " + getRace() + "; Текущее состояние здоровья: " + getHealth() + "; Стрелы: " + getArrows()
    //                 + "; Координаты (" + pos.getX() + " : " + pos.getY() + ")" + "; Приоритет: " + getSpeeed()
    //                 + "\n" + "-".repeat(20);
    //     }
    
    // }

    public String toString() {
        return super.toString() + " \u27b6" + this.arrows;
    }

    public String getInfo() {
        return "Арбалетчик";
    }

}
