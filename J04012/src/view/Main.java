/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new Staff(String.format("NV%02d", 1), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
    }
}

class Staff {
    private String id;
    private String name;
    private int salaryPerDay;
    private int numberOfWorkday;
    private String position;

    public Staff() {
    }

    public Staff(String id, String name, int salaryPerDay, int numberOfWorkday, String position) {
        this.id = id;
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.numberOfWorkday = numberOfWorkday;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getNumberOfWorkday() {
        return numberOfWorkday;
    }

    public void setNumberOfWorkday(int numberOfWorkday) {
        this.numberOfWorkday = numberOfWorkday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    private int getSalary() {
        return numberOfWorkday*salaryPerDay;
    }
    
    private int getBonus() {
        if (numberOfWorkday >= 25) return (int) (getSalary()*0.2);
        if (numberOfWorkday >= 22) return (int) (getSalary()*0.1);
        return 0;
    }
    
    private int getAllowance() {
        switch(position) {
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            default:
                return 150000;
        }
    }
    
    private int getIncome() {
        return getSalary()+getBonus()+getAllowance();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getSalary() + " " + getBonus() + " " + getAllowance() + " " + getIncome();
    }
}
