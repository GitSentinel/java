package BasicProblems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        double sum = 0;

        while(num>0){
            int op = num%10;
            sum += Math.pow(op, 3);
            num /= 10;
        }

        System.out.println(sum);
    }
}
