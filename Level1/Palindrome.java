public class Palindrome {
    public static void main(String[] args) {
        String str="Rawsar";
        str=str.toLowerCase();

        char temp[]=str.toCharArray();
        char arr[]=new char[str.length()];
        // for (int j=0;j<arr.length;j++){
        int j=0;
        for(int i=temp.length-1;i>=0;i--){
           arr[j]=temp[i];
           j++;
        }
    // }
        String str1=new String(arr);
        // System.out.println("the given string is:");
        // System.out.println(strs);
        // System.out.println("the Reversed string is:");
        // System.out.println(str1);

        if(str.equals(str1)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }

    }
}
