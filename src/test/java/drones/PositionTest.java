package drones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {
    @Test
    public void DistanceToSamePosition() {
        Position p = new Position(0, 0, 0);

        double d = p.distanceTo(p);

        assertEquals(0, d);
    }

    @Test
    public void DistanceToAnOtherPoint(){
        Position p1 = new Position(0, 0, 0);
        Position p2 = new Position(3, 4, 12);

        double d = p1.distanceTo(p2);

        assertEquals(13, d);
    }
}
