import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int principle = input.nextInt();
        float rate = input.nextFloat();
        int time = input.nextInt();

        double interest = principle*rate*time;

        System.out.println(interest);
    }
}
