/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiveth;

import java.util.Scanner;

/**
 *
 * @author free bytes
 */
public class Fiveth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter text which has \",\" : ");
        String str = in.nextLine();
        str=str.replace(","," ");
        System.out.println("Your text without \",\" : "+str);
        
    }
    
}
