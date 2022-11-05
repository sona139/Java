import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Import> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new Import(sc.nextLine(), Long.parseLong(sc.nextLine())));
		list.forEach(System.out::println);
	}
}

class Import {
	private String id;
	private long amountImport;

	public Import(String id, long amountImport) {
		this.id = id;
		this.amountImport = amountImport;
	}

	private long getAmountExport() {
		switch (id.charAt(0)) {
			case 'A':
				return Math.round(0.6*amountImport);
			case 'B':
				return Math.round(0.7*amountImport);
			default:
				return 0;
		}
	}

	private long getPriceUnit() {
		switch (id.charAt(id.length()-1)) {
			case 'Y':
				return 110000;
			case 'N':
				return 135000;
			default:
				return 0;
		}
	}

	private long getTotalPrice() {
		return getPriceUnit()*getAmountExport();
	}

	private long getTax() {
		switch (id.substring(0, 1) + id.substring(id.length()-1)) {
			case "AY":
				return (long) (0.08*getTotalPrice());
			case "AN":
				return (long) (0.11*getTotalPrice());
			case "BY":
				return (long) (0.17*getTotalPrice());
			case "BN":
				return (long) (0.22*getTotalPrice());
			default:
				return 0;
		}
	}

	@Override
	public String toString() {
		return id + " " + amountImport + " " + getAmountExport() + " " + getPriceUnit() + " " + getTotalPrice() + " " + getTax();
	}
}