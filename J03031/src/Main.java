import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String s = sc.nextLine();
			int k = Integer.parseInt(sc.nextLine());
			int[] count = new int[26];
			Arrays.fill(count, 0);
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if(count[s.charAt(i) - 'a'] == 0)
					cnt++;
				count[s.charAt(i) - 'a']++;
			}
			System.out.println((cnt+k >= 26 && s.length() >= 26) ? "YES" : "NO");
		}
	}
}