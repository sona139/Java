import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            try {
                String s = sc.next();
                if(pal(s.toCharArray())) {
                    if(map.get(s) == null) {
                        map.put(s, 1);
                        list.add(s);
                    }
                    else map.put(s, map.get(s)+1);
                }
            } catch (RuntimeException e) {
                break;
            }
        }

        int sz = 0;
        for (String s : list)
            sz = Math.max(sz, s.length());
        for (String s : list)
            if(s.length() == sz)
                System.out.println(s + " " + map.get(s));
    }

    public static boolean pal(char[] s) {
        int n = s.length;
        for (int i = 0; i < n/2; i++)
            if(s[i] != s[n-i-1])
                return false;
        return true;
    }
}