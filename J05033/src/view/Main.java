/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ListTime times = new ListTime();
        while(t-- > 0) {
            times.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        times.sort();
        System.out.println(times);
    }
}

class Time {
    private int hours, min, sec;

    public Time(){}
    
    public Time(int hours, int min, int sec) {
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }
    
    public void setSec(int sec) {
        this.sec = sec;
    }
    
    @Override
    public String toString() {
        return hours + " " + min + " " + sec;
    }
}

class ListTime {
    public List<Time> list;
    
    public ListTime() {
        list = new ArrayList<>();
    }
    
    public void add(Time a) {
        list.add(a);
    }
    
    public void sort() {
        Collections.sort(list, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.getHours() != o2.getHours()) {
                    return o1.getHours() - o2.getHours();
                }
                if (o1.getMin() != o2.getMin()) {
                    return o1.getMin() - o2.getMin();
                }
                return o1.getSec() - o2.getSec();
            }
        });
    }
    
    @Override
    public String toString() {
        String res = "";
        for (Time time : list)
            res += time.toString() + "\n";
        return res;
    }
}
