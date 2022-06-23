/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class Lap01_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T ; t++) {
            // Dong 1
            int m = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            //Dong 2
            hinhChuNhat[] hcn = new hinhChuNhat[m];
            for (int i = 0; i < m; i++) {
                hcn[i] = new hinhChuNhat();
                double dai = sc.nextDouble();
                double rong = sc.nextDouble();
                hcn[i].setDai(dai);
                hcn[i].setRong(rong);
            }
            //Dong 3
            hinhVuong[] hv = new hinhVuong[n];
            for (int i = 0; i < n; i++) {
                double canh = sc.nextDouble();
                hv[i] = new hinhVuong(canh);
            }
            //Dong 4
            int P[] = new int[p];
            for (int i = 0; i < p; i++) {
                P[i] = sc.nextInt();
            }
            //Dong 5
            int Q[] = new int[q];
            for (int i = 0; i < q; i++) {
                Q[i] = sc.nextInt();
            }
            //output
            System.out.println("Case #" + t + ":");
            //ket qua dong 4
            for (int i = 0; i < P.length; i++) {
                System.out.println(hcn[i].hienThiThongTin());
            }
            //ket qua dong 5
            for (int i = 0; i < Q.length; i++) {
                System.out.println(hv[i].hienThiThongTin());
            }
        }
    }
}
