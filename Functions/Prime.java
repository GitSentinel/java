package Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int index = primeComposite(number);

        if(index == 0){
            System.out.println("Prime");
        }else {
            System.out.println("Composite");
        }

    }

    static int primeComposite(int num) {
        int fact  = 2, index=0;

        while(fact<num){
            if(num%fact == 0){
                index++;
            }
            fact++;
        }
        return index;
    }
}
