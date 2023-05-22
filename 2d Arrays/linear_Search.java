import java.util.*;
public class linear_Search {
    public static boolean search(int matrix[][],int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("\nElement is present at (" + i +"," +j + ")");
                    return true;
                }
            }
        }
        System.out.println("\nElement not present in the matrix ");
        return false;
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

        System.out.println("\nEnter the element to be searched : ");
        int key = sc.nextInt();

        search(matrix,key);
    }
}
