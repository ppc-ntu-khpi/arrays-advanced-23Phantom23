package domain;

import java.util.Scanner;


 /**
 * The class Main
 */ 
public class Main {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Scanner console = new Scanner(System.in);
        System.out.print("Write number of square matrix rows:");
        int n = console.nextInt();
        System.out.print("Write number of square matrix column:");
        int m = console.nextInt();
        Arrays.creatMatrix(n, m);
    }
}
