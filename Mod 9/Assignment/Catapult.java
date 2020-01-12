/**
 * Calculates the trajectory of a projectile based on angles and launch
 * velocities
 *
 * @version 1/9/20
 * @author Josiah Kowalski
 */

public class Catapult {

    private int[] launchdegree;
    private int[] launchspeed;

    /**
     * Constructor for the Catapult class
     *
     * @param launchdegree
     *            An array containing the angles of elevation for each launch in
     *            degrees.
     * @param launchspeed
     *            An array containing the launch speeds in Miles Pre Hour
     */
    public Catapult(int[] launchdegree, int[] launchspeed) {
        this.launchdegree = launchdegree;
        this.launchspeed = launchspeed;
    }

    /**
     * A static method to calculate the trajectory of an individual launch.
     *
     * @param launchSpeedMilesPerHour
     *            The speed launched in Miles Per Hour.
     * @param launchAngleDegree
     *            The angle of elevation in degrees.
     * @return The trajectory in feet.
     */
    public double calcTrajectory(int launchSpeedMilesPerHour, int launchAngleDegree) {
        double gravityAccel = 9.8;
        double launchSpeedMetersPerSecond = 0.44704 * launchSpeedMilesPerHour;
        double launchAngleRadians = Math.toRadians(launchAngleDegree);
        double launchDistance = 3.2808
                * (Math.pow(launchSpeedMetersPerSecond, 2) * Math.sin(2 * launchAngleRadians) / gravityAccel);
        return launchDistance;
    }

    /**
     * A static method to process the data into an array, and print the results.
     */
    public void processAndPrintResults() {
        double distance[][] = new double[launchspeed.length][launchdegree.length];
        for (int row = 0; row < launchspeed.length; row++) {
            for (int col = 0; col < launchdegree.length; col++) {
                distance[row][col] = calcTrajectory(launchspeed[row], launchdegree[col]);
            }
        }

        System.out.printf("%n%83s%n", "Projectile Distance (feet)");
        System.out.printf("%6s", "MPH");
        for (int value : launchdegree) {
            System.out.printf("%13s", value + " deg");
        }
        System.out.println();
        System.out.println(
                "==========================================================================================================================================");
        for (int row = 0; row < launchspeed.length; row++) {
            System.out.printf("%6d", launchspeed[row]);
            for (int col = 0; col < launchdegree.length; col++) {
                if (distance[row][col] < .001) {
                System.out.printf("%13.0f", distance[row][col]);
                }
                else {
                    System.out.printf("%13.3f", distance[row][col]);
                }
            }
            System.out.println();
        }
    }
}
