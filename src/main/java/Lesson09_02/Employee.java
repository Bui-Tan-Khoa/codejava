/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson09_02;

/**
 *
 * @author Tan khoa
 */
public class Employee implements IEmployee, IShow {

    String name;

    int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void showInfo() {

    }

}
