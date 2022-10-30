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
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList <Accommodation> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < n; i++)
            list.add(new Accommodation(String.format("KH%02d", i+1), sc.nextLine(), sc.nextLine(), sdf.parse(sc.nextLine()), sdf.parse(sc.nextLine())));
        list.sort((a, b) -> {
            return (int) (b.getDays()-a.getDays());
        });
        list.forEach(System.out::println);
    }
}

class Accommodation {
    private String id;
    private String name;
    private String roomId;
    private Date dateIn;
    private Date dateOut;

    public Accommodation() {
    }

    public Accommodation(String id, String name, String roomId, Date dateIn, Date dateOut) {
        this.id = id;
        this.name = name;
        this.roomId = roomId;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
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

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }
    
    public long getDays() {
        long getDiff = dateOut.getTime() - dateIn.getTime();
        return TimeUnit.MILLISECONDS.toDays(getDiff);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + roomId + " " + getDays();
    }
}
