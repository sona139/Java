import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			System.out.println(P.area(new P(sc.nextDouble(), sc.nextDouble()), new P(sc.nextDouble(), sc.nextDouble()), new P(sc.nextDouble(), sc.nextDouble())));
		}
	}
}

class P {
	private double a, b;

	public P() {
	}

	public P(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public static double distance(P p1, P p2) {
		return Math.sqrt((p1.a-p2.a)*(p1.a-p2.a) + (p1.b-p2.b)*(p1.b-p2.b));
	}

	public static Double Heron(double l1, double l2, double l3) {
		return Math.sqrt((l1+l2+l3)*(l1-l2+l3)*(l1+l2-l3)*(l2+l3-l1))/4;
	}

	public static double R(double l1, double l2, double l3) {
		double SMul4 = Heron(l1, l2, l3)*4;
		return l1*l2*l3/SMul4;
	}

	public static String area(P p1, P p2, P p3) {
		double l1 = distance(p1, p2);
		double l2 = distance(p1, p3);
		double l3 = distance(p2, p3);
		if(l1+l2 <= l3 || l1+l3 <= l2 || l2+l3 <= l1)
			return "INVALID";
		double r = R(l1, l2, l3);
		return String.format("%.3f", Math.PI*r*r);
	}
}