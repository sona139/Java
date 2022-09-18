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
        Teacher t = new Teacher(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        System.out.println(t);
    }
}

class Teacher {
    private String teacherId;
    private String teacherName;
    private int salary;

    public Teacher() {
    }

    public Teacher(String teacherId, String teacherName, int salary) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.salary = salary;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getCoefficient() {
        return Integer.parseInt(teacherId.substring(2, 4));
    }
    
    public int getAllowance() {
        String position = teacherId.substring(0, 2);
        switch(position) {
            case "HT":
                return 2000000;
            case "HP":
                return 900000;
            default:
                return 500000;
        }
    }
    
    public int getIncome() {
        return salary*getCoefficient() + getAllowance();
    }

    @Override
    public String toString() {
        return teacherId + " " + teacherName + " " + getCoefficient() + " " + getAllowance() + " " + getIncome();
    }
}
