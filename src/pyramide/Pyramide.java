/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramide;

import java.util.Scanner;
/**
 *
 * @author jbt
 */
public class Pyramide {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int inputUser = sc.nextInt();
        
        for (int line = 0; line < inputUser; line++)
        {
            for (int space = 0; space < inputUser - line; space++)
            {
                System.out.print(" "); 
            } 
            for (int stars = 0; stars <= 2 * line; stars++)
            {
                System.out.print("*"); 
            } 
            System.out.println("");
        }
    } 
}