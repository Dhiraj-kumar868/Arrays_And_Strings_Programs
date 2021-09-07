/*Program to decide if one string is permutation of another string.*/

import java.util.*;
public class CheckPermutation {
    private static String sort(String s) {
        char[] content=s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    private static boolean permutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
        return false;
        }
        return sort(s2).equals(sort(s2));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Two Strings:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean result=permutation(s1,s2);
        System.out.print("Is "+s1+" permutation of "+s2+" ? : "+result);
        sc.close();
    }
}
