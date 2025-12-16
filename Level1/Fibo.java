public class Fibo {
    public static void main(String[] args) {
        int n=6;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=2;i<n;i++){
                int result=a+b;
                System.out.println(result);
                a=b;
                b=result;
        }
    }
}
