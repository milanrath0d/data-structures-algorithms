package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link CircularTour}
 *
 * @author Milan Rathod
 */
class CircularTourTest {

    @Test
    void getStartingPoint() {
        CircularTour.PetrolPump[] petrolPumps = {new CircularTour.PetrolPump(4, 6),
                new CircularTour.PetrolPump(6, 5),
                new CircularTour.PetrolPump(7, 3),
                new CircularTour.PetrolPump(4, 5)};

        CircularTour circularTour = new CircularTour();

        int startingPoint = circularTour.getStartingPoint(petrolPumps);

        assertEquals(1, startingPoint);

        petrolPumps = new CircularTour.PetrolPump[]{new CircularTour.PetrolPump(6, 4),
                new CircularTour.PetrolPump(3, 6),
                new CircularTour.PetrolPump(7, 3)};

        startingPoint = circularTour.getStartingPoint(petrolPumps);

        assertEquals(2, startingPoint);
    }
}