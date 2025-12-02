// import java.util.Scanner;
public class Growingnopyramid {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // TODO: your code here
        int k=1;
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
				}
			System.out.println(" ");

		}
    }
}