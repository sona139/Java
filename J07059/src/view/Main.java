/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Exam> ex = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm");
        for (int i = 1; i <= n; i++)
            ex.add(new Exam(String.format("C%03d", i), sdf.parse(sc.nextLine() + " " + sc.nextLine()), sc.nextLine()));
        ex.sort((a, b) -> {
            if(a.getDate() != b.getDate())
                return a.getDate().compareTo(b.getDate());
            return a.getId().compareTo(b.getId());
        });
        ex.forEach(System.out::println);
    }
}

class Exam {
    private String id;
    private Date date;
    private String room;

    public Exam() {
    }

    public Exam(String id, Date date, String room) {
        this.id = id;
        this.date = date;
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm");
        return id + " " + sdf.format(date) + " " + room;
    }
}
