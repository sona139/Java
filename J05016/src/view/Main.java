
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> bills = new ArrayList<>();
        for (int i = 0; i < n; i++)
            bills.add(new Bill(String.format("KH%02d", i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        bills.sort((a, b) -> {
            return b.getPrice()-a.getPrice();
        });
        bills.forEach(System.out::println);
    }
}

class Bill {
    private String id;
    private String name;
    private String room;
    private Date dateIn;
    private Date dateOut;
    private long day;
    private int fee;
    private long price;

    public Bill(String id, String name, String room, String dateIn, String dateOut, int fee) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.id = id;
        this.name = name;
        this.room = room;
        this.dateIn = sdf.parse(dateIn);
        this.dateOut = sdf.parse(dateOut);
        this.fee = fee;
        this.day = prcDay();
        this.price = prcPrice();
    }

    public Bill() {
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

    public String getroom() {
        return room;
    }

    public void setroom(String room) {
        this.room = room;
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

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    
    public int getPrice() {
        return (int) price;
    }
    
    public long prcDay() {
        long getDiff = dateOut.getTime() - dateIn.getTime();
        long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);
        return getDaysDiff+1;
    }
    
    public long prcPrice() {
        int[] prices = {0, 25, 34, 50, 80};
        long price = day*prices[room.charAt(0)-'0'] + fee;
        return price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + day + " " + price;
    }
}
