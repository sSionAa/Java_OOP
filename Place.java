package Java_OOP;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Place {

    int X, Y;

    Place(int x, int y) {
        X = x;
        Y = y;
    }

    int getX() {
        return X;
    }

    int getY() {
        return Y;
    }

//     public static double getDistance(int x1, int y1, int x2, int y2) {
//         return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//     }

// }
     public static double getDistance(Place hero, Place target) {
        return sqrt((hero.getX()- target.getX()) * (hero.getX()- target.getX()) + (hero.getY()- target.getY()) * (hero.getY()- target.getY()));
    }

    public static Place getDifference(Place hero,Place target) {
        return new Place(hero.getX() - target.getX(), hero.getY() - target.Y);
    }
    public boolean equals (Place place){
        return this.X == place.X && this.Y == place.Y;
    }

}
