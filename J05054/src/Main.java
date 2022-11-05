import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Student> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new Student(String.format("HS%02d", i+1), sc.nextLine(), Float.parseFloat(sc.nextLine())));
		list.sort((a, b) -> {
			return a.getScore() > b.getScore() ? -1 : 1;
		});
		list.get(0).setRank(1);
		for (int i = 1; i < n; i++)
			if(list.get(i).getScore() == list.get(i-1).getScore())
				list.get(i).setRank(list.get(i-1).getRank());
			else list.get(i).setRank(i+1);
		list.sort((a, b) -> {
			return a.getId().compareTo(b.getId());
		});
		list.forEach(System.out::println);
	}
}

class Student {
	private String id;
	private String name;
	private float score;
	private int rank;

	public Student(String id, String name, float score) {
		this.id = id;
		this.name = name;
		this.score = score;
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

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getAcademicAbility() {
		if (score < 5) return "Yeu";
		if (score < 7) return "Trung Binh";
		if (score < 9) return "Kha";
		return "Gioi";
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + score + " " + getAcademicAbility() + " " + rank;
	}
}