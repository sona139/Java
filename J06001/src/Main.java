import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Clothes[] cls = new Clothes[n];
        HashMap<String, Clothes> mapCls = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            cls[i-1] = new Clothes(sc.nextLine() + String.format("-%03d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            if(mapCls.get(cls[i-1].getId().substring(0, 2)) == null)
                mapCls.put(cls[i-1].getId().substring(0, 2), cls[i-1]);
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String[] ip = sc.nextLine().split("\\s+");
            String id = ip[0];
            int number = Integer.parseInt(ip[1]);
            Clothes clothe = mapCls.get(id.substring(0, 2));
            clothe.setId(id + clothe.getId().substring(2, 6));
            System.out.println(clothe.toString(number));
        }
    }
}

class Clothes {
    private String id;
    private String name;
    private int[] price;

    public Clothes() {
    }

    public Clothes(String id, String name, int priceOfTypeOne, int priceOfTypeTwo) {
        this.id = id;
        this.name = name;
        price = new int[3];
        price[1] = priceOfTypeOne;
        price[2] = priceOfTypeTwo;
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

    public int getDiscount(int number) {
        int type = id.charAt(2) - '0';

        if(number >= 150) return (int) (0.5*number*price[type]);
        if(number >= 100) return (int) (0.3*number*price[type]);
        if(number >= 50) return (int) (0.15*number*price[type]);
        return 0;
    }

    public int getPrice(int number) {
        int type = id.charAt(2) - '0';
        return number*price[type] - getDiscount(number);
    }

    public String toString(int number) {
        return id + " " + name + " " + getDiscount(number) + " " + getPrice(number);
    }
}