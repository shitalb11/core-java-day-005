package org.example.StringBasedPrograms;

public class Demo14 {
    public static void main(String[] args) {
        String string = "Java is fun";
        String[] words = string.split(" ");

        for (int i = words.length-1; i >= 0; i--)
            System.out.print(words[i] + " ");
    }
    
}

//Reverse Words in Sentence