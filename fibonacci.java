/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Asisten
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);    
        int inputan=scan.nextInt();
        
        int x=1,y=0,z=1,a,b;
        System.out.println("Hasil: ");
        for(int i=0;i<inputan;i++){
            System.out.print(x+" ");
            x=y+z;
            a=z;
            y=a;
            b=x;
            z=b;
            
        }
    }
}
