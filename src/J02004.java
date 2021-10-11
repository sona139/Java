import java.util.Scanner;
import java.util.Vector;

public class J02004 {
    public static boolean SymmetricalArray(int n, int array[]) {
        for (int i = 0; i < n; ++i)
            if(array[i] != array[n-i-1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; ++t) {
            int n = scanner.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
                array[i] = scanner.nextInt();
            if(SymmetricalArray(n, array))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}