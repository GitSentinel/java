package BasicProblems;

import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
