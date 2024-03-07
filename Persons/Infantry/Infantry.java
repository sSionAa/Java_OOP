
package Java_OOP;

import java.util.ArrayList;



public class Spear extends Persons {
        public Spear(String name,int x, int y, String nameTeam){

            super(name, new Place(x,y), nameTeam,"Elf", 20, 20, 3, 2, 5, 5, 1,"Spear");
        }
    @Override
    public void getStep(ArrayList<Persons> enemy, ArrayList<Persons> friend) {
        if (health<=0) return;

        Persons target = super.getMinDistance(enemy);
        if (Place.getDistance(this.place,target.place) < 2){
            this.toAttack(target);
            return;
        }
        Place diff = Place.getDifference(this.place,target.place);

        Place newposition = new Place(place.getX(), place.getY());

        if (Math.abs(diff.getX()) > Math.abs(diff.getY())){

            newposition.X += diff.getX() < 0 ? 1 : -1;}
        else
        {newposition.Y+= diff.getY() < 0 ? 1 : -1;}

        for (Persons unit : friend) {
            if (unit.place.equals(newposition)&&unit.getHealth()>0) {
                unit.place.X=this.place.getX();
               unit.place.Y=this.place.Y;
                return;
            }

        }
        this.place = newposition;
        System.out.println(this.name + " текущая позиция ("+ place.X + ":" + place.Y+")");



    }
    public  String getInfo(){
        return "Копейщик";
    }
}
