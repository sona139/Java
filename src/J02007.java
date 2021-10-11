import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test = 1; test <= T; ++test)
        {
            System.out.println("Test " + test + ":");
            int n = sc.nextInt();
            int array[] = new int[n], m[] = new int[100001];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
                m[array[i]]++;
            }
            for (int i = 0; i < n; ++i)
            {
                if(m[array[i]] > 0) {
                    System.out.print(array[i] + " xuat hien " + m[array[i]] + " lan\n");
                    m[array[i]] = 0;
                }
            }
        }
    }
}
