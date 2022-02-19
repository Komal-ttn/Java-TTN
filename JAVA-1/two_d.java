import java.util.Scanner;

public class two_d {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row,col,sum;
        System.out.println("Enter no of rows : ");
        row=sc.nextInt();
        System.out.println("Enter no of columns : ");
        col=sc.nextInt();
        int [][]a=new int[row][col];
        System.out.println("Enter values for array");
        for (int i = 0; i < row; i++)
         {
            for (int j = 0; j < col; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Values of Array are : ");
        for (int i = 0; i < row; i++)
         {
            for (int j = 0; j < col; j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //Row wise sum
        for(int i=0;i<row;i++)
        {
            sum=0;
            for(int j=0;j<col;j++)
            {
                sum+=a[i][j];
            }
            System.out.println("Sum of Row "+(i+1)+" is "+sum);
        }
        //Column wise sum
        for(int i=0;i<col;i++)
        {
            sum=0;
            for(int j=0;j<row;j++)
            {
                sum+=a[j][i];
            }
            System.out.println("Sum of Col "+(i+1)+" is "+sum);
        }
    sc.close();
    }
    
}
