public class Countingvowelsconsanant {
    public static void main(String[] args) {
        String str ="Apple1 23de";
       str= str.toLowerCase();
        int vowelscount=0;
        int consocount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
               if(str.charAt(i) == 'a' || str.charAt(i) =='e'|| str.charAt(i) =='i'|| str.charAt(i) =='o' || str.charAt(i) =='u' )
                {
                            vowelscount++;
               }
               else
               {
                  consocount++;
               }
            }
        }

        System.out.println("the vowels count in the string is: "+vowelscount);
        System.out.println("the consonant count in the string is: "+consocount);

    }
}
