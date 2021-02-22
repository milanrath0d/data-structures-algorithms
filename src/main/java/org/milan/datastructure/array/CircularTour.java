package org.milan.datastructure.array;

/**
 * Refer {@link @https://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/}
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Milan Rathod
 */
public class CircularTour {

    /**
     * @param petrolPumps list of petrol pumps
     * @return starting point if circular tour is possible otherwise -1
     */
    public int getStartingPoint(PetrolPump[] petrolPumps) {
        int extra = 0;
        int index = 0;
        int total = 0;

        for (int i = 0; i < petrolPumps.length; i++) {
            total += petrolPumps[i].petrol - petrolPumps[i].distance;
            extra += petrolPumps[i].petrol - petrolPumps[i].distance;
            if (extra < 0) {
                extra = 0;
                index = i + 1;
            }
        }

        return total >= 0 ? index : -1;
    }

    /**
     * A petrol pump has petrol and distance to next petrol pump
     */
    static class PetrolPump {
        int petrol;

        int distance;

        public PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
}
