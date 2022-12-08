
package second;

import java.util.Scanner;


public class Second {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter value : n = ");
        int n = in.nextInt();
        System.out.print("please enter value : r = ");
        int r = in.nextInt();
        long p = 1,f=1,c;
        for (int i = 1; i <=r; i++) {
           p*=n--;
        }
        for (int i = r; i > 1; i--) {
            f*=i;
        }
        c=p/f;
        System.out.println("nCr = "+c);  
        System.out.println("nPr = "+p);
    }
    
}
