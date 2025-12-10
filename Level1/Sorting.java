import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements one by one:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		

		System.out.println("The given array is:");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(a[j]>a[j+1] ) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("array after arranged in the sorted manner");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
		

	}

}
