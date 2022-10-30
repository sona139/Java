import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<GV> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new GV(String.format("GV%02d", list.size() + 1), sc.nextLine(), sc.nextLine()));
		int m = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < m; i++) {
			String key = sc.nextLine();
			System.out.format("DANH SACH GIANG VIEN THEO TU KHOA %s:\n", key);
			for (GV gv : list)
				if(gv.getNAMEUPC().indexOf(key.toUpperCase()) != -1)
					System.out.println(gv);
		}
	}
}

class GV{
	private String code;
	private String name;
	private String mh;

	private String NAMEUPC;

	public GV() {
	}

	public GV(String code, String name, String mhFull) {
		this.name = name;
		this.code = code;
		this.mh = setMh(mhFull.split("\\s+"));
		this.NAMEUPC = name.toUpperCase();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMh() {
		return mh;
	}

	public static String setMh(String[] list) {
		String mh = "";
		for (String i : list)
			mh += Character.toUpperCase(i.charAt(0));
		return mh;
	}

	public String getNAMEUPC() {
		return NAMEUPC;
	}

	@Override
	public String toString() {
		return this.code + " " + this.name + " " + this.mh;
	}
}
