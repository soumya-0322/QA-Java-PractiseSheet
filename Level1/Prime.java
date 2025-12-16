public class Prime {
 
    public static void main(String[] args) {
        int num=97;
        if(num<1){
            System.out.println("Please provide the number it should be positive number.");
        }
        else if(num==1){
            System.out.println("the given number is not prime.");
        }
        else if(num == 2){
            System.out.println("the given number is prime.");
        }
        else{
        boolean prime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i == 0){
                    prime=false;
                    break;
                }
        }

        if(prime){
            System.out.println("the given number is prime.");
        }else
        {
            System.out.println("the given number is not prime.");

        }
    }
    }
    }


