/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hongs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        String file = "SONGUYEN.in";
        ArrayList<Integer> list = IOFile.read(file);
        int[] m = new int [10000];
        Arrays.fill(m, 0);
        for (int i : list)
            m[i]++;
        for (int i = 0; i < 10000; i++)
            if(m[i] != 0 && isPrime(i))
                System.out.println(i + " " + m[i]);
    }
    
    public static boolean isPrime(int n) {
        if(n == 2 || n == 3) return true;
        if(n < 5 || n%2 == 0 || n%3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(n); i++)
            if(n%i == 0 || n%(i+2) == 0) return false;
        return true;
    }
}

class IOFile {
    public static <T> ArrayList<T> read(String file) throws IOException, ClassNotFoundException {
        ArrayList<T> list = new ArrayList<>();
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
        list = (ArrayList<T>) o.readObject();
        return list;
    }
    
//    public static <T> void write(String file, ArrayList<T> list) throws IOException {
//        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
//        o.writeObject(list);
//        o.close();
//    }
}
