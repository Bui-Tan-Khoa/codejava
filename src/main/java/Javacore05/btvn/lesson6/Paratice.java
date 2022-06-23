/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javacore05.btvn.lesson6;

/**
 *
 * @author Tan khoa
 */
public class Paratice {

    public static final double getSum(double... x) {
        double s = 0;

        for (double d : x) {
            s += d;
        }
        return s;
    }

    public static final double getMin(double... x) {
        double min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        char c;
        String strUpper = "";
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                c = (char) (str.charAt(i) - 32);
                strUpper += c;
            } else {
                c = str.charAt(i);
                strUpper += c;
            }
        }
        return strUpper;
    }

    public static String toLower(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] += 32;
            }
        }
        str = String.valueOf(arr);
        return str;
    }

    public static String toUpperFirstChar(String str) {
        str = str.toLowerCase();
        String[] word = str.split(" ");
        String result;
        for (int i = 0; i < word.length; i++) {
            char firstChar = word[i].charAt(0);
            if ('a' <= firstChar && firstChar <= 'z') {
                String toUpperFirstChar = String.valueOf(firstChar).toUpperCase();
                word[i] = toUpperFirstChar + word[i].substring(0);
            }
        }
        result = String.join(" ", word);
        return result;
    }

    public static long getFibonacci(int position) {
        if (position == 1 || position == 2) {
            return 1;
        }
        return getFibonacci(position - 1) + getFibonacci(position - 2);
    }
}
