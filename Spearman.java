package Java_OOP;

public class Spearman extends Persons {
    public Spearman(String name,int x, int y, String nameTeam) {
        super(x,y,name, nameTeam,"Elf", 40, 40, 6, 2, 5, 5, 1, "Spear");
    }
    @Override
    public void getStep(ArrayList<Persons> team) {
    }
}
