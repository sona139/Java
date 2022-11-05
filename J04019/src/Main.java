import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
			Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
			if(!a.valid()){
				System.out.println("INVALID");
			} else{
				System.out.println(a.getPerimeter());
			}
		}
	}
}

class Triangle {
	private Point p1, p2, p3;

	public Triangle() {
	}

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public double distance(Point p1, Point p2) {
		return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX()) + (p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
	}

	public boolean valid() {
		double l1 = distance(p1, p2);
		double l2 = distance(p1, p3);
		double l3 = distance(p2, p3);
		if(l1+l2 <= l3 || l1+l3 <= l2 || l2+l3 <= l1)
			return false;
		return true;
	}

	public String getPerimeter() {
		double l1 = distance(p1, p2);
		double l2 = distance(p1, p3);
		double l3 = distance(p2, p3);
		return String.format("%.3f", l1+l2+l3);
	}
}

class Point {
	private double x, y;

	public Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static Point nextPoint(Scanner sc) {
		return new Point(sc.nextDouble(), sc.nextDouble());
	}
}