package Persons.ArrowsMan;
public class Sniper extends ArrowsUnits {

    public Sniper(String name, int x, int y, String nameTeam, int arrows) {
        super(name, x, y, nameTeam, arrows);
    }
    public  String getInfo(){
        return "Стрелок";
    }
}
