package drones;

public class Position {
    int x;
    int y;
    int z;

    public Position(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Différence entre distance finale et distance départ
    public double distanceTo(Position fin){
        int dx = this.x - fin.x;
        int dy = this.y - fin.y;
        int dz = this.z - fin.z;
    // Calcule de la distance dans un repère 3D
        double distance = Math.sqrt((dx * dx) + (dy * dy) + (dz * dz));

        return distance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
