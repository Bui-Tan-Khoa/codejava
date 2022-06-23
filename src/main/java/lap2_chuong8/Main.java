/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2_chuong8;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        int M, N, P;
        int x, y, z;

        String hoTen;

        SinhVienATTT[] ATTT;
        double diemMD;
        double diemLTAT;
        double diemDTS;
        SinhVienCNTT[] CNTT;
        double diemWeb;
        double diemAndroid;
        double diemNhung;
        SinhVienDTVT[] DTVT;
        double diemVDK;
        double diemTDS;
        double diemTKModule;

        int T = sc.nextInt();

        for (t = 1; t <= T; t++) {
            //dong 1
            M = sc.nextInt();
            ATTT = new SinhVienATTT[M];
            N = sc.nextInt();
            CNTT = new SinhVienCNTT[N];
            P = sc.nextInt();
            DTVT = new SinhVienDTVT[P];
            //dong 2
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            for (int m = 0; m < M; ++m) {
                sc.nextLine();
                hoTen = sc.nextLine();
                diemMD = sc.nextDouble();
                diemLTAT = sc.nextDouble();
                diemDTS = sc.nextDouble();

                ATTT[m] = new SinhVienATTT(hoTen, "ATTT", diemMD, diemLTAT, diemDTS);
            }
            for (int n = 0; n < N; ++n) {
                sc.nextLine();
                hoTen = sc.nextLine();
                diemWeb = sc.nextDouble();
                diemAndroid = sc.nextDouble();
                diemNhung = sc.nextDouble();

                CNTT[n] = new SinhVienCNTT(hoTen, "CNTT", diemWeb, diemAndroid, diemNhung);
            }
            for (int p = 0; p < P; ++p) {
                sc.nextLine();
                hoTen = sc.nextLine();
                diemTDS = sc.nextDouble();
                diemTKModule = sc.nextDouble();
                diemVDK = sc.nextDouble();

                DTVT[p] = new SinhVienDTVT(hoTen, "DTVT", diemTDS, diemTKModule, diemVDK);
            }

            System.out.println("Case #" + t + ":");
            System.out.println(ATTT[x].hienThiThongTin());
            System.out.println(CNTT[y].hienThiThongTin());
            System.out.println(DTVT[z].hienThiThongTin());
        }
    }

}
