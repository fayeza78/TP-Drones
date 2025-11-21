package drones;

public class Mission {
    String nom;
    Path parcours ;
    Drone drone;

    public Mission(String nom, Path parcours, Drone drone){
        this.nom=nom;
        this.parcours=parcours;
        this.drone=drone;
    }

    public String next(Drone drone, Path parcours){

        Position nextPos = parcours.nextPosition();

        if(nextPos.getY() > drone.getAltitude_max()){
            return "KO";
        }
        return "OK";
    }


}
