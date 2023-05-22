import java.util.*;

public class countOf7 {

    public static int count(int matrix[][])
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int count7 = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j] == 7)
                {
                    count7++;
                }
            }
        }
        return count7;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n,m;
      System.out.print("\nEnter the rows and columns of matrix");
      n = sc.nextInt();
      m = sc.nextInt();

      int matrix[][] = new int[n][m];

      System.out.print("\nEnter the elements of matrix :");

      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
            matrix[i][j] = sc.nextInt();
        }
      }

      System.out.print("\nElements of the matrix are :");

      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
            System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
    }

        System.out .println("\nThe count of 7 in the matrix is " + count(matrix));
}
}
