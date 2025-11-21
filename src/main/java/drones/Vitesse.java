package drones;

public class Vitesse {
    double t;
    Position pos;

    //calcul vitesse a partir de la méthode distanceTo()
    public double vitesse(Position depart, Position fin, double t) {
        double distance = depart.distanceTo(fin);
        return distance / t;
    }
}
