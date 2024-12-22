package Functions;

import java.util.Scanner;

public class CircumferenceAreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int radius = in.nextInt();
        float circum = circumference(radius);
        float area = area(radius);

        System.out.println(circum);
        System.out.println(area);

    }

    static float circumference (int rad) {
        float pi = 22/7f;
        float circumference = 2 * pi * rad;

        return circumference;
    }

    static float area (int rad) {
        float pi = 22/7f;
        float area = pi * rad * rad;

        return area;
    }
}
