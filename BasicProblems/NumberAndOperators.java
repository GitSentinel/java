package BasicProblems;

import java.util.Scanner;

public class NumberAndOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char operator = input.next().charAt(0);
        int output = 0;

        if(operator == '+') {
            output+= num1+num2;
        }else if(operator == '-'){
            output+= num1-num2;
        } else if (operator == '*') {
            output+= num1*num2;
        } else if (operator == '/') {
            output+= num1/num2;
        }

        System.out.println(output);


    }
}
