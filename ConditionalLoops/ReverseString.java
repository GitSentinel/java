package ConditionalLoops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine(), reverse = "";
        int n = str.length();


        while(n>0){
            reverse += str.charAt(n-1);
            n--;
        }

        System.out.println(reverse);


    }
}
