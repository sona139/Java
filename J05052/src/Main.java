import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Product[] pros = new Product[n];
        for (int i = 0; i < n; i++)
            pros[i] = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        for (int i = 0; i < n; i++)
            System.out.println(pros[i]);
    }
}

class Product {
    private String name;
    private String id;
    private int price;
    private int number;
    public Product() {
    }

    public Product(String name, String id, int price, int number) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int totalPrice() {
        return price*number - getDiscount();
    }

    public String getSeg() {
        return id.substring(1, 4);
    }

    public int getDiscount() {
        switch (id.charAt(4)) {
            case '1':
                return (int) (price*number*0.5);
            default:
                return (int) (price*number*0.3);
        }
    }

    @Override
    public String toString() {
        return name + " " + id + " " + getSeg() + " " + getDiscount() + " " + totalPrice();
    }
}