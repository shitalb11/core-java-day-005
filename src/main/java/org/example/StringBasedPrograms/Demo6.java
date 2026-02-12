package org.example.StringBasedPrograms;

public class Demo6 {
    public static void main(String[] args) {
        String string = "java is best";
        int v=0,c=0;

        for(char ch : string.toCharArray()){
            if("aeiou".indexOf(ch) != -1) v++;
            else c++;
        }
        System.out.println("Vowels:" + v + " Constants:" + c);
    }
}

//Count Vowels & Consonants