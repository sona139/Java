import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Product> list = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			list.add(new Product(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
			String id = list.get(i).getId();
			if(map.get(id) == null)
				map.put(id, 1);
			else map.put(id, map.get(id)+1);
			id += "0" + map.get(id);
			list.get(i).setId(id);
		}
		list.forEach(System.out::println);
	}
}

class Product {
	private String id;
	private final String name;
	private final long amount;
	private final long unitPrice;

	public Product(String name, long amount, long unitPrice) {
		this.name = name;
		this.id = newID().toUpperCase();
		this.amount = amount;
		this.unitPrice = unitPrice;
	}

	private String newID() {
		String[] list = name.split(" ");
		return list[0].substring(0, 1) + list[1].substring(0, 1);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getPrice() {
		return unitPrice*amount;
	}

	public long getTotalPrice() {
		return (long) ((1-getDiscount())*getPrice());
	}

	public double getDiscount() {
		if(amount > 10) return 0.05;
		if(amount > 7) return 0.02;
		if(amount > 4) return 0.01;
		return 0;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + (long) (getDiscount()*getPrice()) + " " + getTotalPrice();
	}
}