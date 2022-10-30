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
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            students.add(new Student(String.format("PH%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        students.forEach(System.out::println);
    }
}

final class Student {
    private String id;
    private String name;
    private String birthDay;
    private double score1, score2;
    private String rank;

    public Student() {
    }

    public Student(String id, String name, String birthDay, double score1, double score2) {
        this.id = id;
        setName(name);
        setBirthDay(birthDay);
        this.score1 = score1;
        this.score2 = score2;
        setRank();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        StringBuilder sb = new StringBuilder(birthDay);
        if (sb.charAt(1) == '/')
            sb.insert(0, '0');
        if (sb.charAt(4) == '/')
            sb.insert(3, '0');
        this.birthDay = sb.toString();
    }

    public String getRank() {
        return rank;
    }

    public void setRank() {
        switch(getScore()) {
            case 10:
            case 9:
                rank = "Xuat sac";
                break;
            case 8:
                rank = "Gioi";
                break;
            case 7:
                rank = "Kha";
                break;
            case 6:
            case 5:
                rank = "Trung binh";
                break;
            default:
                rank = "Truot";
        }
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

    private int getYearsOld() {
        return 2021-Integer.parseInt(birthDay.substring(6, 10));
    }
    
    private double getRewardScore() {
        if (score1 >= 8 && score2 >= 8)
            return 1;
        if (score1 >= 7.5 && score2 >= 7.5)
            return 0.5;
        return 0;
    }
    
    public int getScore() {
        return (int) Math.min(10, Math.round((score1+score2)/2+getRewardScore()));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getYearsOld() + " " + getScore() + " " + rank;
    }
}

