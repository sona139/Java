import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int n = sc.nextInt();
            if(n%2 == 1) System.out.println(0);
            else {
                int cnt = 0;
                for (int i = 1; i < Math.sqrt(n); ++i) {
                    if (n % i == 0) {
                        if (i % 2 == 0) ++cnt;
                        if (n / i % 2 == 0) ++cnt;
                    }
                }
                if (Math.sqrt(n) == (int) Math.sqrt(n))
                    ++cnt;
                System.out.println(cnt);
            }
        }
    }
}
