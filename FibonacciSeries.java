import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a + ", " + b);

        while(n>2){
            sum=a+b;
            System.out.print( ", " + sum);
            a=b;
            b=sum;
            n--;
        }
    }
}
