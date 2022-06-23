/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap1.lesson07;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Dòng đầu tiên là số lượng Testcase T của bài toán (1 <= T <= 100)
        int T = sc.nextInt();
        
        
        for (int i = 0; i < T; i++) {//chạy TestCase 
            
            
            //INPUT
            
            
            //Dòng 1: 
            int n = sc.nextInt();
            MyPoint[] toaDoDiem = new MyPoint[n];//khai bao mang chua diem

            //Dòng 2: 
            for (int j = 0; j < n; j++) {
                toaDoDiem[j] = new MyPoint();
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                toaDoDiem[j].setXY(x, y);
            }

            //Dòng thứ 3: 
            int k = sc.nextInt();
            k -= 1;

            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();

            double distance = toaDoDiem[k].getDistance(x1, y1);

            //Dòng thứ 4: 
            int p = sc.nextInt();
            p -= 1;

            //Dòng thứ 5: 
            int m = sc.nextInt();

            MyCircle[] circle;
            circle = new MyCircle[m];

            //Dòng thứ 6: 
            for (int j = 0; j < m; j++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                MyPoint toaDoTam = new MyPoint(x, y);
                circle[j].setCentre(toaDoTam);
            }

            //Dòng thứ 7: 
            for (int j = 0; j < m; j++) {
                double radian = sc.nextDouble();
                circle[j].setR(radian);
            }

            //Dòng thứ 8: số tự nhiên q (0<=q<m) cho biết cần phải in thông tin của đường tròn thứ q.
            int q = sc.nextInt();
            q -= 1;

            //Dòng thứ 9: 2 số tự nhiên i, j (0<= i, j < m) cho biết cần phải in ra vị trí tương đối của đường tròn thứ i so với đường tròn thứ j.
            int ii, jj;
            ii = sc.nextInt();
            ii -= 1;
            jj = sc.nextInt();
            jj -= 1;
            

            //OUTPUT
            
            
            System.out.printf("Case #%d", T + 1);
            System.out.println("distance = " + String.format("%." + 3 + "f", distance));
            System.out.println(toaDoDiem[p]);
            System.out.println(circle[q].toString());
            System.out.println(MyCircle.positionOfCircle(circle[ii], circle[jj]));

        }

    }
}
