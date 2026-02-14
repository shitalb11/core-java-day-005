package org.example.StringBasedPrograms;

public class Demo12 {
    public static void main(String[] args) {
        String string="banana";
        String result="";
        for (char c:string.toCharArray())
            if (!result.contains(c+""))
                result+=c;
        System.out.println(result);
    }
}

//Remove Duplicate Characters