package drones;

public class Path {
    //Tableau de positions
    public Position[] positions;
    int indice_position = 0;
    int taille  = positions.length;
    // Si le tab est vide ou null renvoie une exception
    public Path(Position[] positions) {
        if (positions == null || taille == 0) {
            throw new IllegalArgumentException("PAS DE PARCOURS");
        }
        this.positions = positions;
    }

    // Méthode qui renvoie la dernière position sinon exception si
    public Position nextPosition(){

        if(indice_position >= taille){
            throw new IllegalStateException("PLUS DE PARCOURS");
        }
        return positions[indice_position++];

    }

}
