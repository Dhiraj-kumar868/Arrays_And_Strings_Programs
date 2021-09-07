/*Program to determine if a string has all unique characters.*/

import java.util.*;
public class IsUnique{
    public static void main(String[] args){
         System.out.println("Enter the string:");
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         boolean a=isUniqueChars(s);
         System.out.println("Is String has all unique characters : " + a);
         sc.close();
    }


     //Time Complexity= O(n)
    private static boolean isUniqueChars(String s) {
        if(s.length()>128)
            return false;
        boolean[] char_set=new boolean[128];
        for(int i=0;i<s.length();i++){
             int val=s.charAt(i);
             if(char_set[val]){    // Already found this char in string
                 return false;
             }
             char_set[val]=true;
        }
        return true;
    }
}