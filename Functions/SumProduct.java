package Functions;

import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt(), num2 = in.nextInt();
        int sumab = Summ(num1, num2);
        int prodab = Productt(num1, num2);

        System.out.println(sumab);
        System.out.println(prodab);
    }

    static int Summ(int a, int b){
        return a+b;
    }

    static int Productt(int a, int b){
        return a*b;
    }
}
