import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Intern> list = new ArrayList<>();
		HashMap<String, ArrayList<Intern>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			list.add(new Intern(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
			ArrayList<Intern> l = map.get(list.get(i).getBusiness());
			if(l == null) l = new ArrayList<>();
			l.add(list.get(i));
			map.put(list.get(i).getBusiness(), l);
		}
		int m = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < m; i++) {
			String business = sc.nextLine();
			ArrayList<Intern> l = map.get(business);
			l.sort((a, b) -> {
				return a.getName().compareTo(b.getName());
			});
			l.forEach(System.out::println);
		}
	}
}

class Intern{
	private String id;
	private String name;
	private String group;
	private String email;
	private String business;
	private int stt;

	public Intern() {
	}

	public Intern(int stt, String id, String name, String group, String email, String business) {
		this.id = id;
		this.name = name;
		this.group = group;
		this.email = email;
		this.business = business;
		this.stt = stt;
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	@Override
	public String toString() {
		return stt + " " + id + " " + name + " " + group + " " + email + " " + business;
	}
}