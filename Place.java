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

    public static double getDistance(int x1, int y1, int x2, int y2) {
        return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

}
