/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson09_lap1;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, m, n, p, q;

        Rectangle[] list_rec;
        Circle[] list_cir;

        int[] posRec;
        int[] posCir;

        t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            //input
            m = sc.nextInt();
            n = sc.nextInt();
            p = sc.nextInt();
            q = sc.nextInt();

            list_rec = new Rectangle[m];
            list_cir = new Circle[n];
            posRec = new int[p];
            posCir = new int[q];

            for (int j = 0; j < m; j++) {
                list_rec[j] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }

            for (int j = 0; j < n; j++) {
                list_cir[j] = new Circle(sc.nextDouble());
            }

            for (int j = 0; j < p; j++) {
                posRec[j] = sc.nextInt();
            }

            for (int j = 0; j < q; j++) {
                posCir[j] = sc.nextInt();
            }

            //output
            System.out.println("Case #" + i + ":");

            for (int j = 0; j < p; j++) {
                list_rec[posRec[j]].show();
            }

            for (int j = 0; j < q; j++) {
                list_cir[posCir[j]].show();
            }
        }
    }
}
