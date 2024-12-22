package Functions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int reverse = ReverseNum(n);

        if(reverse == n){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    static int ReverseNum(int num){
        int rev = 0, rem;

        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;

            num/=10;
        }

        return rev;

    }
}
