package Functions;

import java.util.Scanner;

public class PythagorianTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();

        int sq1 = num1*num1;
        int sq2 = num2*num2;
        int sq3 = num3*num3;

        String out = isTriplet(sq1,sq2, sq3);
        System.out.println(out);

    }

    static String isTriplet(int a, int b, int c){
        if(a+b == c || a+c == b || b+c == a){
            return "Pythagorian Triplet";
        }else{
            return "Not Pythagorian Triplet";
        }
    }
}
