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

    public MoveResult goTo(Position fin){
        if(fin.getY() > this.altitude_max){
            return new Rejected("L'altitude max est dépassée : " + fin.getY() + "m");
        }

        return new Moving(fin);
    }
}
