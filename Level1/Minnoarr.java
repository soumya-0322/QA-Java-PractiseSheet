import java.util.Scanner;
public class Minnoarr {
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
		
		int minno=Integer.MAX_VALUE;
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++)
			{
				if(minno>=a[i][j])
				{
					minno=a[i][j];
				}
			}
		}
		System.out.println("the small no in the given array is:"+minno);
		sc.close(); 
       
    }
}