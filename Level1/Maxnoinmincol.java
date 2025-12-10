
import java.util.*;
public class Maxnoinmincol {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size:");
		int rowsize=sc.nextInt();
		System.out.println("Enter column size:");
		int colsize=sc.nextInt();
		int a[][]=new int[rowsize][colsize];
		
		  if (rowsize <= 0 || colsize <= 0) {
	            System.out.println("Row and column sizes must be positive.");
	            sc.close();
	            return;
	        }
		
		
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
		
		int minrow=-1;
		int mincol=-1;
		
		int minno=Integer.MAX_VALUE;
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++)
			{
				if(minno>a[i][j])
				{
					minno=a[i][j];
					minrow=i;
					mincol=j;
				}
			}
		}
		System.out.println("the small no in the given array is:"+minno);
		System.out.println("the minimum no found at the position:"+ minrow+","+mincol);
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++)
			{
				if(mincol==j)
				{
					if(max<a[i][j])
					{
						max=a[i][j];
					}
				}
			}
			
		}
		
		System.out.println("the maximum no in the column of minimum no is:"+ max);
		sc.close();

	}

}


