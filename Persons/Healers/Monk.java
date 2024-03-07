package Persons.Healers;
public class Monk extends Healers {
    public Monk(String name, int x, int y, String nameTeam) {
        super(name, x, y, nameTeam);}

    public  String getInfo(){
        return "Монах";
    }
}
