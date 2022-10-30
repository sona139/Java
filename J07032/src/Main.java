import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] m1 = new int[1000001], m2 = new int[1000001];
        Arrays.fill(m1, 0);
        Arrays.fill(m2, 0);
        ArrayList<Integer> list1 = IOFile.read("DATA1.in");
        ArrayList<Integer> list2 = IOFile.read("DATA2.in");
        for (int i : list1) m1[i]++;
        for (int i : list2) m2[i]++;
        int cnt = 0;
        for (int i = 111; i <= 1000000; i++) {
            if (m1[i] != 0 && m2[i] != 0 && checkOut(i, m1[i] + m2[i])) {
                System.out.println(i + " " + (m1[i]+m2[i]));
                cnt++;
            }
            if (cnt == 10) break;
        }
    }
    public static boolean checkOut(int n, int cnt) {
        char[] c = Integer.toString(n).toCharArray();
        int sz = c.length;
        if(sz%2 == 0) return false;
        for (int i = 0; i <= sz/2; i++)
            if(c[i]%2 == 0 || c[i] != c[sz-i-1])
                return false;
        return true;
    }
}

class IOFile {
    public static <T> ArrayList<T> read(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
        ArrayList<T> list = (ArrayList<T>) o.readObject();
        return list;
    }
}