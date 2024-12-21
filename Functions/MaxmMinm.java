package Functions;

import java.util.Scanner;

public class MaxmMinm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        int greatest = MaxNum(num1, num2, num3);
        int smallest = MinNum(num1, num2, num3);

        System.out.println(greatest);
        System.out.println(smallest);

    }

    static int MaxNum(int n1, int n2, int n3){
        if(n1>=n2 && n1>=n3){
            return n1;
        }else if(n2>=n1 && n2>=n3){
            return n2;
        }else{
            return n3;
        }
    }

    static int MinNum(int n1, int n2, int n3){
        if(n1<=n2 && n1<=n3){
            return n1;
        }else if(n2<=n1 && n2<=n3){
            return n2;
        }else{
            return n3;
        }
    }
}
