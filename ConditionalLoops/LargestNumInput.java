package ConditionalLoops;

import java.util.Scanner;

public class LargestNumInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, greatest=0;

        do{
            num = input.nextInt();

            if(num>greatest){
                greatest = num;
            }
        }while (num!=0);

        System.out.println(greatest);
    }
}
