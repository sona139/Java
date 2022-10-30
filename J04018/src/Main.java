import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            SP a = new SP(sc.nextInt(), sc.nextInt());
            SP b = new SP(sc.nextInt(), sc.nextInt());
            SP sum = a.add(b);
            SP c = sum.mul(a);
            SP d = sum.mul(sum);
            System.out.println(c + ", " + d);
        }
    }
}

class SP {
    private int a, b;

    public SP() {
    }

    public SP(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public SP add(SP other) {
        return new SP(a+other.a, b+other.b);
    }

    public SP mul(SP other) {
        return new SP(a*other.a-b*other.b, a*other.b+b*other.a);
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }
}