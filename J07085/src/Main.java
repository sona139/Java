import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) o.readObject();
        for (String s : list) {
            char[] num = String.join("", s.split("\\D")).toCharArray();
            int sum = 0, i = 0;
            while(i < num.length && num[i] == '0')
                i++;
            for (int j = i; j < num.length; j++) {
                sum += num[j] - '0';
                System.out.print(num[j]);
            }
            System.out.println(" " + sum);
        }
    }
}