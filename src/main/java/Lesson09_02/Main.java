/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson09_02;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {

            int m = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();

            FullTimeEmployee[] full = new FullTimeEmployee[m];
            PartTimeEmployee[] part = new PartTimeEmployee[n];
            int[] vtfull = new int[p];
            int[] vtpart = new int[q];

            sc.nextLine();

            for (int j = 0; j < m; j++) {
                full[j] = new FullTimeEmployee(sc.nextLine(), sc.nextInt());
                sc.nextLine();
            }
            for (int j = 0; j < n; j++) {
                part[j] = new PartTimeEmployee(sc.nextLine(), sc.nextInt(), sc.nextInt());
                sc.nextLine();
            }
            for (int j = 0; j < p; j++) {
                vtfull[j] = sc.nextInt();
            }
            for (int j = 0; j < q; j++) {
                vtpart[j] = sc.nextInt();
            }

            System.out.println("Case #" + i + ":");

            for (int j = 0; j < p; j++) {
                System.out.println("Full time employee:");
                full[vtfull[j]].showInfo();
            }

            for (int j = 0; j < q; j++) {
                System.out.println("Part time employee");
                part[vtpart[j]].showInfo();
            }
        }
    }
}

