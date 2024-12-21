package Functions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        OddOrEven(n);
    }

    static void OddOrEven(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
