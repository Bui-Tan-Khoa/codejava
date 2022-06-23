/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap1.lesson07;

/**
 *
 * @author Tan khoa
 */
public class testMyCircle {

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2, 3, 5);

        MyCircle c2 = new MyCircle(new MyPoint(6, 6), 8);

        System.out.println("Chu vi duong tron thu 1: " + c1.getCircumference());
        System.out.println("Dien tich duong tron thu 1: " + c1.getArea());

        System.out.println("Chu vi duong tron thu 2: " + c2.getCircumference());
        System.out.println("Dien tich duong tron thu 2: " + c2.getArea());

        System.out.println("Thong tin duong tron thu 1:");
        System.out.println(c1.toString());

        System.out.println("Thong tin duong tron thu 2:");
        System.out.println(c2.toString());
    }
}
