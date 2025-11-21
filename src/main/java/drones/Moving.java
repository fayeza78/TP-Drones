package drones;

public class Moving extends MoveResult {
    Position fin;

    public Moving(Position fin) {
        this.fin = fin;
    }

    public Position getDestination() {
        return fin;
    }
}
