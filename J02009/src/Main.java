import java.util.Arrays;
import java.util.Scanner;

class Pair<K, V> {
    K first;
    V second;
    Pair() {
        first = null;
        second = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair<Integer, Integer>[] a = new Pair[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Pair<>();
            a[i].first = sc.nextInt();
            a[i].second = sc.nextInt();
        }
        Arrays.sort(a, (Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) -> {
            if(o1.first != o2.first)
                return o1.first-o2.first;
            return o1.second-o2.second;
        });
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (a[i].first > time)
                time = a[i].first;
            time += a[i].second;
        }
        System.out.println(time);
    }
}