package ConditionalLoops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt(), sum=0, fact=1;

        while(num > fact*fact ){
            if(num%fact == 0 ){
                sum+= fact + num/fact;
            }
            fact++;
        }

        sum-=num;

        if(sum == num){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
}
