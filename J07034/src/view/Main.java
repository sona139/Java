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
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> subjects = new ArrayList<>();
        for (int i = 0; i < n; i++)
            subjects.add(new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        subjects.sort((a, b) -> {
            return a.getName().compareTo(b.getName());
        });
        subjects.forEach(System.out::println);
    }
}

class Subject {
    private String id;
    private String name;
    private int numberOfCredit;

    public Subject() {
    }

    public Subject(String id, String name, int numberOfCredit) {
        this.id = id;
        this.name = name;
        this.numberOfCredit = numberOfCredit;
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

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public void setNumberOfCredit(int numberOfCredit) {
        this.numberOfCredit = numberOfCredit;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberOfCredit;
    }
}