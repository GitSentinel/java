package ConditionalLoops;

import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(), r = input.nextInt();
        int nmr = n-r;
        double nfact=1, rfact=1, nmrfact=1;

        while(n>0){
            nfact *= n;
            n--;
        }

        while(r>0){
            rfact *= r;
            r--;
        }

        while(nmr>0){
            nmrfact *= nmr;
            nmr--;
        }

        double ncr = nfact/(rfact*nmrfact);
        double npr = ncr*rfact;

        System.out.println(ncr);
        System.out.println(npr);
    }
}
