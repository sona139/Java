import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream((new FileInputStream("NHIPHAN.in")));
        ArrayList<String> list = (ArrayList<String>) o.readObject();
        ArrayList<String> list1 = new ArrayList<>();
        HashMap<String, Integer> m = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String[] tmp = list.get(i).toLowerCase().trim().split("\\s+");
            for (int j = 0; j < tmp.length; j++)
                m.put(tmp[j], 1);
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> list2 = new ArrayList<>();
        while(sc.hasNext())
            list2.add(sc.next().toLowerCase());
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list2)
            if(map.get(s) == null && m.get(s) != null) {
                System.out.println(s);
                map.put(s, 1);
            }
    }
}
