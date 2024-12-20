package ConditionalLoops;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int point1x = input.nextInt();
        int point1y = input.nextInt();
        int point1z = input.nextInt();
        int point2x = input.nextInt();
        int point2y = input.nextInt();
        int point2z = input.nextInt();

        double distance = Math.sqrt(Math.pow((point1x-point2x), 2) + Math.pow((point1y-point2y), 2) + Math.pow((point1z-point2z), 2));


        System.out.println(distance);

    }
}
