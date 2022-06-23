/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson09_lap1;

/**
 *
 * @author Tan khoa
 */
public class Circle implements IShape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void show() {
        System.out.println("Circle(r = " + String.format("%." + 6 + "f", this.radius) + "): perimeter = " + String.format("%." + 3 + "f", this.getPerimeter()) + ", area = " + String.format("%." + 3 + "f", this.getArea()));
    }
    
}
