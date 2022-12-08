/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th;

import java.util.Scanner;

/**
 *
 * @author free bytes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter number of rows : ");
        int row=in.nextInt();
        System.out.print("please enter number of coloms : ");
        int col=in.nextInt();
        int arr[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("please enter item "+i+"*"+j+" : ");
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("The Transposed matrix is:");
        for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.print(arr[j][i]+" ");
            }
                System.out.println();
            }
    }
    
}
