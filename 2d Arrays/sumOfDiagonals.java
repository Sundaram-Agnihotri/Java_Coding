import java.util.*;

public class sumOfDiagonals {

    public static int sumD(int matrix[][])
    {
        int sum = 0;
        for(int i=0;i<matrix.length;i++)
        {
            sum += matrix[i][i];

            if(i!=matrix.length-i-1)
            {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
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
         System.out.print(sumD(matrix));
    }
}