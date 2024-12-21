package Functions;

import java.util.Scanner;

public class VotingEligibity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        eligible(n);
    }

    static void eligible(int age){
        if(age>=18){
            System.out.println("Eligible");
        }else {
            System.out.println("Ineligible");
        }
    }
}
