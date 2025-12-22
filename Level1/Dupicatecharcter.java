    import java.util.*;

public class Dupicatecharcter {
    public static void main(String[] args) {                              //Programming --->progamin
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter String:");
        String str=sc.nextLine();
        String str1="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
            boolean isduplicate=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    isduplicate=true;
                }
            }

            if(!isduplicate){
                str1=str1+str.charAt(i);
            }
        }
        }
        System.out.println("The string afteer removing the duplicate elements: "+str1);
        

        sc.close();
    }
}


