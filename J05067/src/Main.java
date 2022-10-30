import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Management> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new Management(sc.next(), Integer.parseInt(sc.next())));
		list.forEach(System.out::println);
	}
}

class Management {
	private String id;
	private int number;

	public Management() {
	}

	public Management(String id, int number) {
		this.id = id;
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private String getManufacturer() {
		switch (id.substring(id.length()-2)) {
			case "BP":
				return "British Petro";
			case "ES":
				return "Esso";
			case "SH":
				return "Shell";
			case "CA":
				return "Castrol";
			case "TN":
				return "Trong Nuoc";
			default:
				return "Mobil";
		}
	}

	private long getUnitPrice() {
		switch (id.substring(0, 1)) {
			case "X":
				return 128000;
			case "D":
				return 11200;
			default:
				return 9700;
		}
	}

	private long getPrice() {
		return number*getUnitPrice();
	}

	private long getTax() {
		if(id.substring(id.length()-2).equals("TN"))
			return 0;
		switch (id.substring(0, 1)) {
			case "X":
				return (long) (getPrice()*0.03);
			case "D":
				return (long) (getPrice()*0.035);
			default:
				return (long) (getPrice()*0.02);
		}
	}

	private long getTotalPrice() {
		return getPrice() + getTax();
	}

	@Override
	public String toString() {
		return id + " " + getManufacturer() + " " + getUnitPrice() + " " + getTax() + " " + getTotalPrice();
	}
}