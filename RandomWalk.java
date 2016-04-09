package Lab02_Walk;
import java.util.Scanner;
import java.util.Random;


public class RandomWalk {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the # of steps: ");
        String a = scan.next();
        int x = Integer.parseInt(a);

        int yVal = 0;
        int xVal = 0;

        for (int i = 0; i < x; i++) {

            Random direction = new Random();
            int randomDirection = direction.nextInt(4);

            if (randomDirection == 0) {
                yVal += 1;
            }
            if (randomDirection == 1) {
                xVal += 1;
            }
            if (randomDirection == 2) {
                yVal -= 1;
            }
            if (randomDirection == 3) {
                xVal -= 1;
            }
            System.out.println(xVal+ ", " +yVal);
        }
        System.out.println("Squared distance: " + ((xVal*xVal) + (yVal*yVal)));

    }
}