package Java_OOP;

public class Rogue extends Persons {
    public Rogue(String name, int x, int y, String nameTeam) {
        super(x,y,name, nameTeam,"Goblin", 30, 30, 4, 0, 6, 2, 1, "Pistol");
    }
    @Override
    public void getStep(ArrayList<Persons> team) {
    }
}
