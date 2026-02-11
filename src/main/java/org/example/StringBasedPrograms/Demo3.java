package org.example.StringBasedPrograms;

public class Demo3 {
    public static void main(String[] args) {
        String string= "Java language";
        int count=0;
        for (char c:string.toCharArray()) count++;
        System.out.println(count);
    }
}

//String Length (without length())