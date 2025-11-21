package drones;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InMemoryAllDrones implements AllDrones{

    private final List<Drone> drones = new ArrayList<>();

    @Override
    public void add(Drone drone){
        if (drone == null) {
            return;
        }
        drones.add(drone);
    }

    @Override
    public void remove(String nom){
        if (nom == null){
            return;
        }
        drones.remove(nom);
    }


    public List<Drone> allDrones(){

        //évite que quelqun modifie la liste interne directement
        return Collections.unmodifiableList(drones);
    }

    public Object findBy(String nom){
        if (nom == null){
            return new NotFound();
        }
        for (Drone d:allDrones()){
            if (nom.equals(d.nom)){
                return new Found();
            }

            return new NotFound();
        }
    }








}
