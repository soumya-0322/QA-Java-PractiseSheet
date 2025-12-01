// import java.util.Scanner;
public class ContinuousNumberPyramid{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // TODO: your code here
           int a=1;
		for(int i=4;i>=1;i--) {
			
			for(int j=1;j<=i;j++)
			{   
				System.out.print(a+" ");
				a++;
			}
			
			System.out.println();
			
		}


    }
}