package ConditionalLoops;

import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(), num2 = input.nextInt();
        int hcf = 1, lcm = 1;

        while(num1%hcf == 0 && num2%hcf == 0){
            hcf++;
        }

        while(lcm%num1 != 0 || lcm%num2 != 0){
            lcm++;
        }

        System.out.println(--hcf);
        System.out.println(lcm);


    }
}
