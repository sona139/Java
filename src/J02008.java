import java.util.Scanner;

public class J02008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			int n = sc.nextInt();
			long ans = 1;
			for (long i = 2; i <= n; ++i) {
				long Gcd = Gcd(ans, i);
				ans = ans/Gcd*i;
			}
			System.out.println(ans);
		}
	}

	public static long Gcd(long a, long b) {
		while(a > 0)
		{
			long temp = b%a;
			b = a;
			a = temp;
		}
		return b;
	}
}
