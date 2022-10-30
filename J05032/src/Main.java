import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<People> ps = new ArrayList<>();
		for (int i = 0; i < n; i++)
			ps.add(new People(sc.next(), sc.next()));
		ps.sort((a, b) -> {
			try {
				return a.getDob().compareTo(b.getDob());
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		});
		System.out.println(ps.get(ps.size()-1));
		System.out.println(ps.get(0));
	}
}

class People {
	private String name;
	private String dob;

	public People() {
	}

	public People(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(dob);
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return name;
	}
}