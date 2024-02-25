package com.naveen.dsa.recursionandbacktracking;

/**
 * @author <a href="mailto:naveenkumarerroju@gmailcom.com">Naveen Kumar</a>
 */
public class ReverseAString {

    public static void main(String[] args) {
        String strin = "Mancherial";
        System.out.println(strin.toUpperCase());
    }

    public String reverseString(String string, String reverse) {

        if (string.length() == 1) {
            reverse += string;
            return reverse;
        } else {
            reverse += string.charAt(string.length() - 1);
            return reverseString(string.substring(0, string.length() - 1), reverse);
        }
    }

}
