
package first;

import java.util.Scanner;


public class First {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter asci code : ");
        int a = in.nextInt();
        System.out.println("this is the asci of => "+(char)a);
    }
    
}
