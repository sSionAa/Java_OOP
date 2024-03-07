package Game_OOP;


import static java.lang.Math.sqrt;

public class Place {

    public int X;
    public int Y;
    public Place(int x, int y) {
        X = x;
        Y = y;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public static double getDistance(Place hero, Place target) {
        return sqrt((hero.getX()- target.getX()) * (hero.getX()- target.getX()) + (hero.getY()- target.getY()) * (hero.getY()- target.getY()));
    }
    public static Place getDifference(Place hero, Place target) {
        return new Place(hero.getX() - target.getX(), hero.getY() - target.Y);
    }
    public boolean equals (Place place){
        return this.X == place.X && this.Y == place.Y;
    }

}
