package Persons.Infantry;


public class Spearman extends Infantry {
    public Spearman(String name, int x, int y, String nameTeam) {
        super(name, x, y, nameTeam);
    }

    
    public  String getInfo(){
        return "Копейщик";
    }
}
