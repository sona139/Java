import java.util.Scanner;
import java.lang.Math;

public class prime {

    public static boolean isPrime(int number) {
        if(number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); ++i)
            if(number%i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; ++i) {
            int number = scanner.nextInt();
            if(isPrime(number))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
