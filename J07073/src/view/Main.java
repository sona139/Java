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
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Register> regs = new ArrayList<>();
        for (int i =1; i <= n; i++)
            regs.add(new Register(sc.nextLine(), sc.nextLine(), Integer.parseInt((sc.nextLine())), sc.nextLine(), sc.nextLine()));
        ArrayList<Register> practices = new ArrayList<>();
        for (Register i : regs) {
            if(i.getPracticeForm().equals("Truc tiep") == false)
                practices.add(i);
        }
        practices.sort((a, b) -> {
            return a.getId().compareTo(b.getId());
        });
        
        practices.forEach(System.out::println);
    }
}

class Register {
    private String id;
    private String name;
    private int credits;
    private String theoreticalForm;
    private String practiceForm;

    public Register() {
    }

    public Register(String id, String name, int credits, String theoreticalForm, String practiceForm) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.theoreticalForm = theoreticalForm;
        this.practiceForm = practiceForm;
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getTheoreticalForm() {
        return theoreticalForm;
    }

    public void setTheoreticalForm(String theoreticalForm) {
        this.theoreticalForm = theoreticalForm;
    }

    public String getPracticeForm() {
        return practiceForm;
    }

    public void setPracticeForm(String practiceForm) {
        this.practiceForm = practiceForm;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + credits + " " + theoreticalForm + " " + practiceForm;
    }
}
