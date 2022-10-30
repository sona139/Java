/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> timers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] listTime = sc.nextLine().split(" ");
            for (int j = 0; j < 3; j++)
                if (listTime[j].length() == 1)
                    listTime[j] = " " + listTime[j];
            timers.add(String.join(" ", listTime));
        }
        timers.sort((a, b) -> {
            return a.compareTo(b);
        });
        timers.forEach(System.out::println);
    }
}

class Timer {
    private Date time;

    public Timer(Date time) {
        setTime(time);
    }

    public Timer() {
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
    public String convertDateToString() {
        SimpleDateFormat df = new SimpleDateFormat("kk mm ss");
        return df.format(time);
    }

    @Override
    public String toString() {
        return convertDateToString();
    }
}
