package Java_OOP;

import javax.swing.text.Position;
import java.util.ArrayList;

public class Rogue extends Persons {
    
    public Rogue(String name, int x, int y, String nameTeam) {
        super(x,y,name, nameTeam,"Goblin", 30, 30, 4, 0, 6, 2, 1, "Pistol");
    }
    
    @Override
     public void getStep(ArrayList<Persons> enemy, ArrayList<Persons> friend) {
        if (health <= 0) return;
        Persons target = super.getMinDistance(enemy);
        if (Place.getDistance(this.place,target.place) < 2) {
            this.toAttack(target);
            return;
        }
        Place diff = Place.getDifference(this.place,target.place);
        Place newposition = new Place(place.X, place.Y);
        if (Math.abs(diff.X) > Math.abs(diff.Y)) {
            newposition.X += diff.X < 0 ? 1 : -1;
        } else {
            newposition.Y += diff.Y < 0 ? 1 : -1;
        }
        for (Persons unit : friend) {
          if (unit.place.equals(newposition)) {
                    unit.place.X=place.X;
                    unit.place.Y=place.Y;
         }
        }
        place = newposition;
    }
    public  String getInfo(){
        return "Вор";
    }
}
