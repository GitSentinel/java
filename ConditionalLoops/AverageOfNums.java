package ConditionalLoops;

import java.util.Scanner;

public class AverageOfNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double count = n, sum=0;

        while(n>0){
            int num = input.nextInt();
            sum += num;
            n--;
        }

        System.out.println(sum/count);
    }
}
