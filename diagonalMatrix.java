import java.util.*;
public class diagonalMatrix {

    public static int printDiagonal(int matrix[][]){
        int sum = 0;
    // for(int i=0; i<matrix.length; i++){//BRUTE FORCE (O(n^2))
    //     for(int j=0; j<matrix[0].length; j++){
    //         if(i==j){
    //             sum += matrix[i][j];
    //         }
    //         else if(i+j == matrix.length-1){
    //             sum += matrix[i][j];
    //         }
    //     }
    // }
    for(int i=0; i<matrix.length; i++){//time complexity O(n)
        // primary diagonal
        sum += matrix[i][i];
        if(i != matrix.length-i-1)
        sum += matrix[i][matrix.length-i-1];
    }
    return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        
        System.out.println("Diagonal Sum is :" +printDiagonal(matrix));
    }
}
