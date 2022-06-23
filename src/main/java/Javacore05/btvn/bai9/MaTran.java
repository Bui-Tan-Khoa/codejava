/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javacore05.btvn.bai9;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class MaTran {

    int hang, cot;
    int[][] a = new int[hang][cot];

    public MaTran() {
    }

    public MaTran(int hang, int cot) {
        this.hang = hang;
        this.cot = cot;
    }

    void nhapMaTran() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void xuatMaTran() {
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }

    void xoayTrai90() {
        for (int j = cot - 1; j >= 0; j--) {
            for (int i = 0; i < hang; i++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }

    void xoay180() {
        for (int i = hang - 1; i >= 0; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }

    void xoayPhai90() {
        for (int j = 0; j < cot; j++) {
            for (int i = hang - 1; i >= 0; i--) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
