package Java_OOP;

public class Monk extends Persons {
    public Monk(String name, int x, int y, String nameTeam) {
        super(x,y,name, nameTeam,"Human",5, 25, 20, 10, 3, 1, 1, "Stick");
    }
    // @Override
    // public void getStep(ArrayList<Persons> team) {
    // }
    @Override
    public void getStep(ArrayList<Persons> team, ArrayList<Persons> friend) {
    }
    public  String getInfo(){
        return "Монах";
    }
}
