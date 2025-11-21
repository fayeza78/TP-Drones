package drones;

public class Drone {
    String nom;
    Float altitude_max;
    Vitesse vitesse;
    Position p;

    public Drone (String nom, Float altitude_max, Vitesse vitesse, Position p ){
        this.nom = nom;
        this.altitude_max = altitude_max;
        this.vitesse = vitesse;
        this.p = p;
    }


    public Float getAltitude_max() {
        return altitude_max;
    }

    public MoveResult goTo(Position destination){
        if(destination.getY() > this.altitude_max){
            return new Rejected("L'altitude max est dépassée : " + destination.getY() + "m");
        }

        return new Moving(destination);
    }
}
