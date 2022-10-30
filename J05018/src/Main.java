import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < n; i++)
			students.add(new Student(String.format("HS%02d", i+1), sc.nextLine(), sc.nextLine().split("\\s+")));
		students.sort((a, b) -> {
			if(a.getAvg() != b.getAvg()) {
				if(a.getAvg() > b.getAvg())
					return -1;
				return 1;
			}
			return a.getId().compareTo(b.getId());
 		});
		students.forEach(System.out::println);
	}
}

class Student {
	private String id;
	private String name;
	private double[] scores;

	public Student() {
	}

	public Student(String id, String name, String[] scores) {
		this.id = id;
		this.name = name;
		this.scores = new double[10];
		for (int i = 0; i < 10; i++)
			this.scores[i] = Double.parseDouble(scores[i]);
		this.scores[0] *= 2.0;
		this.scores[1] *= 2.0;
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

	public double[] getScores() {
		return scores;
	}

	public void setScores(double[] scores) {
		this.scores = scores;
	}

	public double getAvg() {
		double sum = 0;
		for (double f : scores)
			sum += f;
		sum /= 12;
		return Math.round(sum*10.0)/10.0;
	}

	public String getStt() {
		double avg = getAvg();
		if(avg >= 9) return "XUAT SAC";
		if(avg >= 8) return "GIOI";
		if(avg >= 7) return "KHA";
		if(avg >= 5) return "TB";
		return "YEU";
	}

	@Override
	public String toString() {
		return id + " " + name + " " + getAvg() + " " + getStt();
	}
}