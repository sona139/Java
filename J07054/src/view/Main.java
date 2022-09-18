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
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            students.add(new Student(String.format("SV%02d", i), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        students.sort((Student a, Student b) -> {
            if(b.getScore() != a.getScore())
                if(a.getScore() > b.getScore()) return -1;
                else return 1;
            return a.getId().compareTo(b.getId());
        });
        students.get(0).setRank(1);
        for (int i = 1; i < n; i++)
            if (students.get(i).getScore() == students.get(i-1).getScore())
                students.get(i).setRank(students.get(i-1).getRank());
            else students.get(i).setRank(i+1);
        students.forEach(System.out::println);
    }
}

class Student {
    private String id;
    private String name;
    private double score1, score2, score3;
    private int rank;

    public Student(String id, String name, double score1, double score2, double score3) {
        this.id = id;
        setName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public Student() {
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

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }
    
    public double getScore() {
        return (score1*3+score2*3+score3*2)/8;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", getScore()) + " " + rank;
    }
}
