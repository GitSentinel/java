package ConditionalLoops;

import java.util.Scanner;

public class SubstractProductFromSumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int prod = 1, sum = 0;

        while(num>0){
            prod *= num%10;
            sum += num%10;

            num /= 10;
        }

        int output = prod - sum;
        System.out.println(output);
    }
}
