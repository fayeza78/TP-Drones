package drones;

public interface AllMissions {

    //ajoute une nouvelle mission
    add(Mission mission);

    //retire une mission à partir de son nom
    remove(String nom);
}
