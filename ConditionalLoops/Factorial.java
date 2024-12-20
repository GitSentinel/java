package ConditionalLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt(), prod = 1;

        while(num>0){
            prod*=num;
            num--;
        }

        System.out.println(prod);
    }
}
