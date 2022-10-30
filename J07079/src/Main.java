import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) o.readObject();
        for (String s : list) {
            String bin = String.join("", s.split("[^01]"));
            System.out.println(bin + " " + Long.parseLong(bin, 2));
        }
    }
}