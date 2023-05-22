import java.util.*;

public class Input_Outpur{
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        // input class in java
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the elements in matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output in java 
        System.out.println("\nElements of the matrix are : ");1
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}