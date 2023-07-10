package com.naveen.dsa.recursionandbacktracking;

public class Palindrome {

    public static boolean isPalindrome(String s){

        //function will recurse untill this condition meets.
        if(s.length()==0 || s.length()==1){
            return true;
        }

        //if first and last characters are same. then function will recurse.
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }

        //when the first and last characters are not same.
        return false;
    }

}
