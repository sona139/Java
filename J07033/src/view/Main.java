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
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++)
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        students.sort((Student a, Student b) -> {
            return a.getId().compareTo(b.getId());
        });
        students.forEach(System.out::println);
    }
}


class Student {
    private String id;
    private String name;
    private String group;
    private String email;

    public Student() {
    }

    public Student(String id, String name, String group, String email) {
        this.id = id;
        setName(name);
        this.group = group;
        this.email = email;
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
        String[] list = name.trim().toLowerCase().split("\\s+");
        for (int i = 0; i < list.length; i++)
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1);
        this.name = String.join(" ", list);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + email;
    }
}