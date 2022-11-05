import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Order> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new Order(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
		list.forEach(System.out::println);
	}
}

class Order {
	private String nameItem;
	private String idItem;
	private long priceUnit;
	private long amountItem;

	public Order() {
	}

	public Order(String nameItem, String idItem, long priceUnit, long amountItem) {
		this.nameItem = nameItem;
		this.idItem = idItem;
		this.priceUnit = priceUnit;
		this.amountItem = amountItem;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public String getIdItem() {
		return idItem;
	}

	public void setIdItem(String idItem) {
		this.idItem = idItem;
	}

	public long getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(long priceUnit) {
		this.priceUnit = priceUnit;
	}

	public long getAmountItem() {
		return amountItem;
	}

	public void setAmountItem(long amountItem) {
		this.amountItem = amountItem;
	}

	private String getNumerical() {
		return idItem.substring(1, 4);
	}

	private long getPrice() {
		return priceUnit*amountItem;
	}

	private long getDiscount() {
		switch (getTypeItem()) {
			case '1':
				return Math.round(0.5*getPrice());
			default:
				return Math.round(0.3*getPrice());
		}
	}

	public long getTotalPrice() {
		return getPrice() - getDiscount();
	}

	private char getTypeItem() {
		return idItem.charAt(idItem.length()-1);
	}

	@Override
	public String toString() {
		return nameItem + " " + idItem + " " + getNumerical() + " " + getDiscount() + " " + getTotalPrice();
	}
}