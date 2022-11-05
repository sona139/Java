import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Clothes> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new Clothes(sc.nextLine(), i+1, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String[] ip = sc.nextLine().trim().split("\\s+");
            String id = ip[0].substring(0, 2);
            int type = Integer.parseInt(ip[0].substring(2));
            long number = Integer.parseInt(ip[1]);
            for (Clothes cls : list)
                if(cls.getId().equals(id))
                    System.out.println(cls.toString(number, type));
        }
    }
}

class Clothes {
    private String id;
    private int status;
    private String name;
    private long[] price;

    public Clothes() {
    }

    public Clothes(String id, int status, String name, long priceOfTypeOne, long priceOfTypeTwo) {
        this.id = id;
        this.status = status;
        this.name = name;
        price = new long[3];
        price[1] = priceOfTypeOne;
        price[2] = priceOfTypeTwo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long[] getPrice() {
        return price;
    }

    public void setPrice(long[] price) {
        this.price = price;
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

    public long getDiscount(long number, int type) {
        if(number >= 150) return Math.round((0.5*number*price[type]));
        if(number >= 100) return Math.round((0.3*number*price[type]));
        if(number >= 50) return Math.round((0.15*number*price[type]));
        return 0;
    }

    public long getPrice(long number, int type) {
        return number*price[type] - getDiscount(number, type);
    }

    public String toString(long number, int type) {
        return id + type + String.format("-%03d ", status) + name + " " + getDiscount(number, type) + " " + getPrice(number, type);
    }
}