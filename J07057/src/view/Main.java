/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            students.add(new Student(String.format("TS%02d", i), sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        students.sort((a, b) -> {
            if(a.getTotalScore() != b.getTotalScore()) {
                if(a.getTotalScore() > b.getTotalScore())
                    return -1;
                return 1;
            }
            return a.getId().compareTo(b.getId());
        });
        students.forEach(System.out::println);
    }
}

class Student {
    private String id;
    private String name;
    private double score;
    private String ethnic;
    private String area;
    private String status;

    public Student() {
    }

    public Student(String id, String name, double score, String ethnic, String area) {
        this.id = id;
        setName(name);
        this.score = score;
        this.ethnic = ethnic;
        this.area = area;
        setStatus();
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
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++)
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
        this.name = String.join(" ", list);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        if (getTotalScore() >= 20.5) status = "Do";
        else status = "Truot";
    }
    
    public double getTotalScore() {
        double score = getScore();
        if (ethnic.equals("Kinh") == false) score += 1.5;
        if (area.equals("1")) score += 1.5;
        else if (area.equals("2")) score += 1;
        return score;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", getTotalScore()) + " " + status;
    }
}