import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Staff> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new Staff(String.format("NV%02d", i+1), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		String position = sc.nextLine();
		list.forEach(e -> {
			if(e.getPosition().equals(position))
				System.out.println(e);
		});
	}
}

class Staff {
	private String id;
	private String name;
	private String position;
	private int dailyWage;
	private int workDay;

	public Staff(String id, String name, String position, int dailyWage, int workDay) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.dailyWage = dailyWage;
		this.workDay = workDay;
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

	public int getdailyWage() {
		return dailyWage;
	}

	public void setdailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}

	public int getWorkDay() {
		return workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	private int getPositionBonus() {
		switch (position) {
			case "GD":
				return 500;
			case "PGD":
				return 400;
			case "TP":
				return 300;
			case "KT":
				return 250;
			default:
				return 100;
		}
	}

	private int getWage() {
		return Math.round((dailyWage*workDay + getPositionBonus())/1000)*1000;
	}

	private long getAvanceSalary() {
		return Long.min (25000L, Math.round((double) (getPositionBonus() + getWage())*2.0/3000)*1000);
	}

	private long getRemainingSalary() {
		return getWage()-getAvanceSalary()+getPositionBonus();
	}

	@Override
	public String toString() {
		return id + " " + name + " " + getPositionBonus() + " " + getWage() + " " + getAvanceSalary() + " " + getRemainingSalary();
	}
}