package drones;

public class Rejected extends MoveResult{
    //Drone drone ;
    //Position pos;

    //public boolean goTo(Drone drone, Position fin){
        //if(drone.getAltitude_max() < fin.getY()){
           // return false;
        //}
        //return true ;
    //}

    String reject;

    public Rejected(String reject){
        this.reject=reject;
    }

    public String getReject(){
        return reject;
    }
}
