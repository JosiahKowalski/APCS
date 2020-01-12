/**
 * Tests the Catapult class with sample data.
 *
 * @version 1/9/20
 * @author Josiah Kowalski
 */
public class CatapultTester {

    public static void main(String args[]) {
        int[] launchDegree = { 0, 20, 30, 45, 50, 60, 70, 75, 80, 90 };
        int[] launchSpeed = { 20, 25, 30, 35, 40, 45, 50, 100, 200, 300 };
        Catapult launch = new Catapult(launchDegree, launchSpeed);
        launch.processAndPrintResults();
    }
}
