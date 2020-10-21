package base;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(capitalize("abcdef")));
    }

    public static String[] capitalize(String s) {
        String upp = "";
        String low = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                upp += Character.toUpperCase(s.charAt(i));
                low += Character.toLowerCase(s.charAt(i));
            } else {
                upp += Character.toLowerCase(s.charAt(i));
                low += Character.toUpperCase(s.charAt(i));
            }
        }
        String arr[] = new String[2];
        arr[0] = upp;
        arr[1] = low;
        return arr;
    }
}









