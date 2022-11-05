import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		while (true)
			try {
				String s = sc.nextLine().trim().toLowerCase();
				String[] l = s.split("\\s+");
				for (int i = 0; i < l.length; i++) {
					if (l[i].substring(l[i].length() - 1).matches("[,?.!:]")) {
						list.add(l[i].substring(0, l[i].length() - 1));
						list.add(l[i].substring(l[i].length() - 1));
					} else {
						list.add(l[i]);
					}
				}
			} catch (Exception e) {
				break;
			}
		String res = "";
		for (String i : list) {
			if(i.matches("[.!?]")) {
				System.out.println(res);
				res = "";
			}
			else if(i.matches("[,:]")) {
				res = res.substring(0, res.length()-1) + i + " ";
			}
			else {
				if(res == "")
					res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
				else res += i + " ";
			}
		}
		if(res != "")
			System.out.println(res);
	}
}