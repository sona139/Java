import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long fibonacci[] = new long[93];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < 93; ++i)
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        while(T-- > 0) {
            int n = sc.nextInt();
            System.out.println(fibonacci[n]);
        }
    }
}
