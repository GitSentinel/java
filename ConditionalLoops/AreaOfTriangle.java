package ConditionalLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int rad = input.nextInt();
        double area = (22/7f) * Math.pow(rad,2);

        System.out.println(area);
    }
}
