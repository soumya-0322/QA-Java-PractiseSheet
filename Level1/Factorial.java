public class Factorial {
    public static void main(String[] args) {
        int fact=0;
        int factresult=1;
        if(fact==0){
            System.out.println("the factorial of a "+fact+"! is: 1");
        }
        else{
            for(int i=1;i<=fact;i++){
                  factresult*=i;
            }
        System.out.println("the factorial of a "+fact+"! is:"+factresult);

        }

    }
}
