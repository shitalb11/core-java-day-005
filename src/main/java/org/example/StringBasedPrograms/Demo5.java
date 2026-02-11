package org.example.StringBasedPrograms;

public class Demo5 {
    public static void main(String[] args) {
        String string = "madam";
        String rev = "";
        for(int i = string.length()-1 ; i>=0 ; i--)
            rev += string.charAt(i);
        System.out.println(string.equals(rev));
    }
}

//Palindrome String