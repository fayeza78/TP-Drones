package drones;

import java.lang.reflect.Array;
import java.util.List;

public interface AllDrones {

    //ajoute un nouveau drone
    void add(Drone drone);

    //supprime un drone à partir de son nom
    void remove(String nom);

    //retourne la liste de tous les drones
    List<Array> allDrones();

    //recherche un drone par son nom
    Object findBy(String nom);
}
