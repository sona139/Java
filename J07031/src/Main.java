import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] m1 = new int[1000001];
        int[] m2 = new int[1000001];
        Arrays.fill(m1, 0);
        Arrays.fill(m2, 0);
        int[] primes = new int [1000001];
        Arrays.fill(primes, 1);
        primes[0] = primes[1] = 0;
        for (int i = 2; i <= 1000; i++)
            if(primes[i] == 1)
                for (int j = i*i; j <= 1000000; j+=i)
                    primes[j] = 0;
        ArrayList<Integer> list1 = IOFile.read("DATA1.in");
        ArrayList<Integer> list2 = IOFile.read("DATA2.in");
        for (int i : list1)
            m1[i]++;
        for (int i : list2)
            m2[i]++;
        for (int i = 1; i <= 500000; i++)
            if(primes[i] == 1 && primes[1000000-i] == 1 && m1[i] != 0 && m2[1000000-i] == 0 && m2[i] == 0 && m1[1000000-i] != 0)
                System.out.println(i + " " + (1000000-i));
    }
}

class IOFile {
    public static <T> ArrayList<T> read(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
        ArrayList<T> list = (ArrayList<T>) o.readObject();
        return list;
    }
}