package drones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DroneTest {
    @Test
    void test1() {
        assertThat(1 + 1).isEqualTo(2);
    }


    @Test
    public void RejectWhenAltitudeIsTooHigh() {

        Drone drone = new Drone("D1", 100f, null, new Position(0, 0, 0));
        Position fin = new Position(10, 150, 0);

        MoveResult result = drone.goTo(fin);

        assertTrue(result instanceof Rejected, "Mouvement doit être rejeté");
        Rejected rej = (Rejected) result;
        assertTrue(rej.getReject().contains("L'altitude max est dépassée"));
    }
    @Test
    public void MovingWhenAltitudeIsOk() {
        Drone drone = new Drone("D1", 100f, null, new Position(0, 0, 0));
        Position fin = new Position(10, 80, 0);

        MoveResult result = drone.goTo(fin);

        assertTrue(result instanceof Moving);
        Moving mov = (Moving) result;
        assertEquals(fin, mov.getDestination());
    }
}
