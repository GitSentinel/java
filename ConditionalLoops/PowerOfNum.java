package ConditionalLoops;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt(), power = input.nextInt();
        int output = 1;

        while(power>0){
            output *= num;
            power--;
        }

        System.out.println(output);
    }
}
