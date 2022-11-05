import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Product> products = new ArrayList<>();
		for (long i = 1; i <= n; i++)
			products.add(new Product(String.format("MH%02d", i), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		products.forEach(System.out::println);
	}
}

class Product {
	private String name;
	private String unit;
	private long priceImport;
	private long numberImport;
	private String id;

	public Product() {
	}

	public Product(String id, String name, String unit, long priceImport, long numberImport) {
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.priceImport = priceImport;
		this.numberImport = numberImport;
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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public long getPriceImport() {
		return priceImport;
	}

	public void setPriceImport(long priceImport) {
		this.priceImport = priceImport;
	}

	public long getNumberImport() {
		return numberImport;
	}

	public void setNumberImport(long numberImport) {
		this.numberImport = numberImport;
	}

	private long getTransportFee() {
		return Math.round(0.05*(priceImport*numberImport));
	}

	private long getTotalPrice() {
		return numberImport*priceImport + getTransportFee();
	}

	private long getPriceExport() {
		return Math.round(1.02*getTotalPrice());
	}

	@Override
	public String toString() {
		return id + " " + name + " " + unit + " " + getTransportFee() + " " + getTotalPrice() + " " + getPriceExport();
	}
}