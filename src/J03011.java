import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            System.out.println(Gcd(a, b));
        }
    }

    public static BigInteger Gcd(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }
}
