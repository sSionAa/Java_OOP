package Java_OOP;

public class Spearman extends Persons {
    public Spearman(String name,int x, int y, String nameTeam) {
        super(x,y,name, nameTeam,"Elf", 40, 40, 6, 2, 5, 5, 1, "Spear");
    }
//     @Override
//     public void getStep(ArrayList<Persons> team) {
//     }
// }
    @Override
    public void getStep(ArrayList<Persons > enemy, ArrayList<Persons> friend) {
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
    
