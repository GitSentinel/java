package BasicProblems;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float curr = input.nextFloat();
        float convertedCurr = curr/85.10f;

        System.out.println(convertedCurr);
    }
}
