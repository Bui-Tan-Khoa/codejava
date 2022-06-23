/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javacore05.btvn.lesson6;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, size, k;
        double[] arr;
        String str1, str2;

        t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            size = sc.nextInt();
            arr = new double[size];
            nhapMang(arr, sc);

            sc.nextLine();
            str1 = sc.nextLine();
            str2 = sc.nextLine();

            k = sc.nextInt();
            System.out.printf("Case #%d\n", i);
            System.out.printf("SUM: %.2f\n", Paratice.getSum(arr));
            System.out.printf("Min: %f\n", Paratice.getMin(arr));
            System.out.printf("Max: %f\n", Paratice.getMax(arr));
            System.out.printf("To upper: %s\n", Paratice.toUpper(str1));
            System.out.printf("To lower: %s\n", Paratice.toLower(str2));
            System.out.printf("To upper first char: %s - %s\n", Paratice.toUpperFirstChar(str1), Paratice.toUpperFirstChar(str2));
            System.out.printf("Fibonnaci(%d): %d\n", k, Paratice.getFibonacci(k));
        }
    }

    public static void nhapMang(double[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
    }
}
