import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			PS ps1 = new PS(sc.nextInt(), sc.nextInt());
			PS ps2 = new PS(sc.nextInt(), sc.nextInt());
			PS ps3 = PS.add(ps1, ps2);
			ps3 = PS.mul(ps3, ps3);
			System.out.println(ps3 + " " + PS.mul(PS.mul(ps1, ps2), ps3));
		}
	}
}

class PS {
	private long a, b;

	public PS(long a, long b) {
		this.a = a;
		this.b = b;
	}

	public long getA() {
		return a;
	}

	public void setA(long a) {
		this.a = a;
	}

	public long getB() {
		return b;
	}

	public void setB(long b) {
		this.b = b;
	}

	public static PS G(PS o) {
		long a = o.a, b = o.b;
		while(b > 0) {
			long c = a;
			a = b;
			b = c%b;
		}
		return new PS(o.a/a, o.b/a);
	}

	public static PS add(PS o1, PS o2) {
		PS res = new PS(o1.a*o2.b + o1.b*o2.a, o1.b*o2.b);
		return PS.G(res);
	}

	public static PS mul(PS o1, PS o2) {
		PS res = new PS(o1.a*o2.a, o1.b*o2.b);
		return PS.G(res);
	}

	@Override
	public String toString() {
		return a + "/" + b;
	}
}