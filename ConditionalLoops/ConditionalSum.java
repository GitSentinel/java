package ConditionalLoops;

import java.util.Scanner;

public class ConditionalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, sumneg=0, sumeven=0, sumodd=0;

        do{
            num = input.nextInt();

            if(num<0){
                sumneg+=num;
            }else if(num%2 == 0){
                sumeven+=num;
            }else{
                sumodd+=num;
            }
        }while(num!=0);

        System.out.println(sumneg);
        System.out.println(sumeven);
        System.out.println(sumodd);
    }
}
