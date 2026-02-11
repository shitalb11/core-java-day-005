package org.example.StringBasedPrograms;

public class Demo4 {
    public static void main(String[] args) {
        String string= "JAVA";
        String rev="";
        for(int i= string.length()-1; i>=0; i--)
            rev=rev+string.charAt(i);
        System.out.println(rev);
    }
}

//Reverse a String