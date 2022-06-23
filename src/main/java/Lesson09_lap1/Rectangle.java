/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson09_lap1;

/**
 *
 * @author Tan khoa
 */
public class Rectangle implements IShape {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void show() {
        System.out.println("Rectangle(" + String.format("%." + 6 + "f", this.length) + ", " + String.format("%." + 6 + "f", this.width) + "): perimeter = " + String.format("%." + 3 + "f", this.getPerimeter()) + ", area = " + String.format("%." + 3 + "f", this.getArea()));

    }
}

