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
			String mh = GV.setMh(sc.nextLine().split("\\s+"));
			System.out.format("DANH SACH GIANG VIEN BO MON %s:\n", mh);
			for (GV gv : list)
				if(gv.getMh().equals(mh))
					System.out.println(gv);
		}
	}
}

class GV{
	private String code;
	private String name;
	private String mh;

	private String mhFull;

	public GV() {
	}

	public GV(String code, String name, String mhFull) {
		this.name = name;
		this.code = code;
		this.mhFull = mhFull;
		this.mh = setMh(mhFull.split("\\s+"));
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

	public String getMhFUll() {
		return mhFull;
	}

	@Override
	public String toString() {
		return this.code + " " + this.name + " " + this.mh;
	}
}
