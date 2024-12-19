package BasicProblems;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class PalidromeSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int n = str.length();
        String reverse = "";

        for(int i = n-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("Palidromic");
        }else{
            System.out.println("Not Palindromic");
        }
    }
}
