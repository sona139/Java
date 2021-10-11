import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; ++t){
            System.out.print("Test " + t + ": ");
            int n = sc.nextInt();
            for (int i = 2; i <= Math.sqrt(n); ++i)
            {
                if(n%i == 0) {
                    System.out.print(i);
                    int cnt = 0;
                    while(n%i == 0) {
                        ++cnt;
                        n /= i;
                    }
                    System.out.print("(" + cnt + ") ");
                }
            }
            if(n > 1) System.out.print(n + "(1)");
            System.out.println("");
        }
    }
}
