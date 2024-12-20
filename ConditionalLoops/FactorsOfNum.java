package ConditionalLoops;

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int factor = 1;

        while(num > factor*factor){
            if(num%factor == 0){
                System.out.print(factor + " " + num/factor + " ");
                factor++;
            }
        }


    }
}
