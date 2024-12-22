package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int fact = FactorialCalculation(n);

        System.out.println(fact);
    }

    static int FactorialCalculation(int num){
        int sum = 1;

        while(num>0){
            sum*=num;
            num--;
        }

        return sum;
    }
}
