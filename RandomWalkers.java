package Lab02_Walk;
import java.util.Random;
import java.util.Scanner;

public class RandomWalkers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the # of steps: ");
        String a = scan.next();
        int N = Integer.parseInt(a);

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the # of experiments: ");
        String b = scan2.next();
        int T = Integer.parseInt(b);

        int sqDist = 0;
        int newSqDist = 0;
        double mean;

        for (int x = 0; x < T; x++) {

            int yVal = 0;
            int xVal = 0;

            for (int i = 0; i < N; i++) {

                Random dir = new Random();
                int direction = dir.nextInt(4);

                if (direction == 0) {
                    yVal += 1;
                }
                if (direction == 1) {
                    xVal += 1;
                }
                if (direction == 2) {
                    yVal -= 1;
                }
                if (direction == 3) {
                    xVal -= 1;
                }
//                System.out.println("(" +xVal+ ", " +yVal+ ")");
                sqDist = ((xVal*xVal) + (yVal*yVal));

            }

            newSqDist += sqDist;
//            System.out.println("");
        }
        mean = (newSqDist / T);
        System.out.println("Mean squared distance: " + Math.abs(mean));
    }

}
