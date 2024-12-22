package Functions;

import java.util.Scanner;

public class PrimeBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt(), n2 = input.nextInt();
        int nos = PrimeNos(n1, n2);

        System.out.println(nos);
    }

    static int PrimeNos(int num1, int num2){
        int count = 0;

        while(num1<num2){
            if(primeComposite(num1)){
                count++;
            }

            num1++;
        }

        return count;
    }

    static boolean primeComposite(int num) {
        int fact  = 2, index=0;

        while(fact<num){
            if(num%fact == 0){
                index++;
            }
            fact++;
        }

        if(index==0){
            return true;
        }else{
            return false;
        }
    }
}
