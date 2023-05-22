import java.util.*;

public class spiral_printing {

    public static void printmat(int matrix[][])
    {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        int i,j;

        while(startRow<=endRow && startCol <= endCol)
        {
            for(j=0;j<=endCol;j++)
            {
                System.out.print(matrix[startRow][j] +" ");
            }
        for(i= startRow + 1;i<=endRow;i++)
        {
            System.out.print(matrix[i][endCol] +" ");
        }

        for(j = endCol-1;j>=startCol;j--)
        {
            if(startRow == endRow)break;

            System.out.print(matrix[endRow][j] +" ");
        }

        for(i=endRow-1;i>=startRow;i--)
        {
            if(startCol == endCol)break;

            System.out.print(matrix[i][startCol] +" ");
        }
        
        startRow++;
        startCol++;
        endRow--;
        endCol--;
    }
    System.out.println();
}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the rows and columns of matrix : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        System.out.println("\nEnter the elements of matrix :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nElemnts of matrix are :");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        System.out.print("\nThe spiral output of above matrix be : ");
        printmat(matrix);
    }
}
