import java.util.Scanner;

public class Maxnoarr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size:");
		int rowsize=sc.nextInt();
		System.out.println("Enter column size:");
		int colsize=sc.nextInt();
		int a[][]=new int[rowsize][colsize];
		System.out.println("Enter the no for the given size of the array:");
		
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The entered  Dimensional array is:");
		for(int i=0;i<rowsize;i++) 
		{
			for(int j=0;j<colsize;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		int maxno=Integer.MIN_VALUE;
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++)
			{
				if(maxno<=a[i][j])
				{
					maxno=a[i][j];
				}
			}
		}
		System.out.println("the Largest no in the given array is:"+maxno);
		sc.close();

        
    }
}
