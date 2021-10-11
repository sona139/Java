import java.util.Vector;

import java.util.Scanner;

public class Problem1466 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			long number = sc.nextLong();
			Vector<Long> vl = new Vector<>();
			while(number > 0) {
				vl.add(number%10);
				number/= 10;
			}
			long sum = 0;
			for (int i = vl.size() - 1; i >= 0; --i) {
				long temp = 0;
				for (int j = i; j >= 0; --j) {
					temp *= 10;
					temp += vl.get(j);
					sum += temp;
				}
			}
			System.out.print(sum + '\n');
		}
	}
}
