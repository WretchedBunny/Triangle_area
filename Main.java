package com.Triangle_Area;
import java.math.*;
public class Main {
    public static float t_area(String str){
        int a = -2;
        int strLength = str.length();
        for(int i = 0; i < strLength; i++) {
            if (str.charAt(i) == '\n') {
                a++;
            }
        }

        return (float)(Math.pow(a,2)/2);
    }

    public static void main(String[] args) {
        String example ="\n.\n. .\n. . .\n. . . .\n. . . . .\n. . . . . .\n. . . . . . .\n. . . . . . . .\n. . . . . . . . .\n";
        System.out.println(t_area(example));
    }


}
