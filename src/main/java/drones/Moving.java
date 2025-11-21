package drones;

public class Moving extends MoveResult {
    Position destination;

    public Moving(Position destination) {
        this.destination = destination;
    }

    public Position getDestination() {
        return destination;
    }
}
