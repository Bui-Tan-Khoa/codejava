/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson09_02;

/**
 *
 * @author Tan khoa
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return super.paymentPerHour * 8;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + super.getName() + ", salary per day: " + this.calculateSalary());
    }

}
