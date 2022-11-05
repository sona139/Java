import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Cusomer> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new Cusomer(String.format("KH%02d", i+1), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		list.sort((a, b) -> {
			return a.getTotalPrice() > b.getTotalPrice() ? -1 : 1;
		});
		list.forEach(System.out::println);
	}
}

class Cusomer {
	private String id;
	private String type;
	private int indexBefore;
	private int indexAfter;

	public Cusomer() {
	}

	public Cusomer(String id, String type, int indexBefore, int indexAfter) {
		this.id = id;
		this.type = type;
		this.indexBefore = indexBefore;
		this.indexAfter = indexAfter;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIndexBefore() {
		return indexBefore;
	}

	public void setIndexBefore(int indexBefore) {
		this.indexBefore = indexBefore;
	}

	public int getIndexAfter() {
		return indexAfter;
	}

	public void setIndexAfter(int indexAfter) {
		this.indexAfter = indexAfter;
	}

	private int getCoefficient() {
		switch (type) {
			case "KD":
				return 3;
			case "NN":
				return 5;
			case "TT":
				return 4;
			default:
				return 2;
		}
	}

	private int getAmount() {
		return indexAfter-indexBefore;
	}

	private long getPrice() {
		return 550*getCoefficient()*getAmount();
	}

	private long getPriceExtra() {
		if(getAmount() < 50) return 0;
		if(getAmount() <= 100) return Math.round(getPrice()/100.0*35);
		return getPrice();
	}

	public long getTotalPrice() {
		return getPrice()+getPriceExtra();
	}

	@Override
	public String toString() {
		return id + " " + getCoefficient() + " " + getPrice() + " " + getPriceExtra() + " " + getTotalPrice();
	}
}