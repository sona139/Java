import java.util.Scanner;

public class J01013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), ans = 0;
		for (int j = 0; j < n; ++j)
		{
			int number = sc.nextInt();
			for (int i = 3; i <= Math.sqrt(number); i += 2)
				while(number%i == 0)
				{
					ans += i;
					number /= i;
				}
			while(number%2 == 0)
			{
				number /= 2;
				ans += 2;
			}
			if(number > 1)
				ans += number;
		}
		System.out.println(ans);
	}
}
