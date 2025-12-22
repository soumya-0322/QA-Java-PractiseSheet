import java.util.*;
public class Firstnonrepeated {

    public static void main(String[] args) {                              //swiss   
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter String:");
        String str=sc.nextLine();
        // int count;
        // String temp=" ";

        for(int i=0;i<str.length();i++){
                    int  count=0;
            if(str.charAt(i)!= ' '){
                for(int j=0;j<str.length();j++){
                    if(str.charAt(i) == str.charAt(j) && i!=j){
                         count++;
                         break;
                    }
                }
                if(count==0){
            // temp=temp+str.charAt(i);
            System.out.println("the first non repeated charater in a string is:"+str.charAt(i));
            break;
            }
               
        }

        }

        

       
sc.close();

        
    }
}
