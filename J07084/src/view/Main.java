/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TimeOnline> times = new ArrayList<>();
        DateTimeFormatter std = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        for (int i = 0; i < n; i++)
            times.add(new TimeOnline(sc.nextLine(), LocalDateTime.parse(sc.nextLine(), std), LocalDateTime.parse(sc.nextLine(), std)));
        times.sort((a, b) -> {
            if(a.getMin() != b.getMin()) {
                return (int) (b.getMin()-a.getMin());
            }
            return a.getName().compareTo(b.getName());
        });
        
        times.forEach(System.out::println);
    }
}

class TimeOnline {
    private String name;
    private LocalDateTime first, last;

    public TimeOnline() {
    }

    public TimeOnline(String name, LocalDateTime first, LocalDateTime last) {
        DateTimeFormatter std = DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm:ss");
        this.name = name;
        this.first = first;
        this.last = last;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getFirst() {
        return first;
    }

    public void setFirst(LocalDateTime first) {
        this.first = first;
    }

    public LocalDateTime getLast() {
        return last;
    }

    public void setLast(LocalDateTime last) {
        this.last = last;
    }
    
    
    public long getMin() {
        return Duration.between(first, last).toMinutes();
    }

    @Override
    public String toString() {
        return name + " " + getMin();
    }
}
