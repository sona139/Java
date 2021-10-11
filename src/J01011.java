import java.util.Scanner;
import java.lang.Math;
import java.util.stream.LongStream;

public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            long a = sc.nextInt(), b = sc.nextInt();
            long Gcd = Gcd(a, b);
            System.out.println(a/Gcd*b + " " + Gcd);
        }
    }

    public static long Gcd (long a, long b) {
        while(a > 0) {
            long temp = b%a;
            b = a;
            a = temp;
        }
        return b;
    }
}
