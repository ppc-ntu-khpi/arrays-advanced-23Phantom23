package domain;

import java.util.Random;


 /**
 * The class Arrays
 */ 
public class Arrays {


/** 
 *
 * Creat matrix
 *
 * @param n  the rows
 * @param m  the column
 */
    public static void creatMatrix(int n, int m) { 

        int[][] matrix = new int[n][m];
        int[][] matrixTransp = new int[m][n];
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.ints(9, 100).findFirst().getAsInt();
            }
        }
        
        System.out.println("Your matrix:");
        viewMatrix(matrix, n, m);
        System.out.println("Your transport matrix:");
        transoprtMatrix(matrixTransp, matrix, n, m);
        viewMatrix(matrixTransp, m, n);
    }
    

/** 
 *
 * Transoprt matrix
 *
 * @param matrixTransp[][]  the matrix transport
 * @param matrix[][]  the matrix
 * @param n  the rows
 * @param m  the column
 * @return int[][] matrix tranport
 */
    public static int[][] transoprtMatrix(int matrixTransp[][], int matrix[][], int n, int m){         

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrixTransp[i][j] = matrix[j][i];
            }
        }
        return matrixTransp;
    }


/** 
 *
 * View matrix
 *
 * @param matrix[][]  the matrix[][]
 * @param n  the rows
 * @param m  the column
 */
    public static void viewMatrix(int matrix[][], int n, int m) { 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.print("\n");
        }
    }
}
