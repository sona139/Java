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
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<FullName> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new FullName(sc.nextLine().trim()));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            ArrayList<FullName> res = new ArrayList<>();
            String[] name = sc.nextLine().split("[.]");
            list.stream().filter(f -> (Equals(f.getList(), name))).forEachOrdered(f -> {
                res.add(f);
            });
            res.sort((FullName a, FullName b) -> {
                if(a.getLastName().equals(b.getLastName()))
                    return a.getName().compareTo(b.getName());
                return a.getLastName().compareTo(b.getLastName());
            });
            res.forEach(System.out::println);
        }
    }
    
    public static boolean Equals(String[] list, String[] name) {
        if(list.length != name.length) return false;
        for (int i = 0; i < list.length; i++)
            if(list[i].charAt(0) != name[i].charAt(0) && name[i].charAt(0) != '*')
                return false;
        return true;
    }
}

class FullName {
    private String name;
    private String lastName;
    private String[] list;
    private String firstName;

    public FullName() {
    }

    public FullName(String name) {
        this.name = name;
        this.list = name.split("\\s+");
        this.lastName = list[list.length-1];
        this.firstName = list[0];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
