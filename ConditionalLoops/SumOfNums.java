package ConditionalLoops;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, sum=0;

        do{
            num = input.nextInt();
            sum+=num;
        }while(num!=0);

        System.out.println(sum);
    }
}
