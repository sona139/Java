import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ip = sc.nextLine().split("\\s+");
		int n = Integer.parseInt(ip[0]);
		int m = Integer.parseInt(ip[1]);
		Student[] students = new Student[n];
		String[] hw = new String[m+1];
		for (int i = 0; i < n; i++)
			students[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
		for (int i = 1; i <= m; i++) {
			hw[i] = sc.nextLine();
		}
		Arrays.sort(students, (a, b) -> {
			return a.getId().compareTo(b.getId());
		});
		for (Student st : students)
			System.out.println(st.toString(hw[st.getGroup()]));
	}
}

class Student {
	private String id;
	private String name;
	private String phone;
	private int group;

	public Student() {
	}

	public Student(String id, String name, String phone, int group) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.group = group;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String toString(String hw) {
		return id + " " + name + " " + phone + " " + group + " " + hw;
	}
}