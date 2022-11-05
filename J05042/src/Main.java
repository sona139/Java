import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Student> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new Student(sc.nextLine(), sc.nextLine().split(" ")));
		list.sort((a, b) -> {
			if(a.getAcceptSubmition() != b.getAcceptSubmition())
				return b.getAcceptSubmition()-a.getAcceptSubmition();
			return a.getSubmit()-b.getSubmit();
		});
		list.forEach(System.out::println);
	}
}

class Student {
	private String name;
	private int acceptSubmition;
	private int submit;

	public Student(String name, String[] list) {
		this.name = name;
		this.acceptSubmition = Integer.parseInt(list[0]);
		this.submit = Integer.parseInt(list[1]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcceptSubmition() {
		return acceptSubmition;
	}

	public void setAcceptSubmition(int acceptSubmition) {
		this.acceptSubmition = acceptSubmition;
	}

	public int getSubmit() {
		return submit;
	}

	public void setSubmit(int submit) {
		this.submit = submit;
	}

	@Override
	public String toString() {
		return name + " " + acceptSubmition + " " + submit;
	}
}