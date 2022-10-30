/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Integer> list = IOFile.read("DATA.in");
        int[] m = new int[1000];
        Arrays.fill(m, 0);
        list.forEach(i -> {
            m[i]++;
        });
        for (int i = 0; i < 1000; i++)
            if(m[i] != 0)
                System.out.println(i + " " + m[i]);
    }
}

class IOFile {
    public static <T> ArrayList<T> read(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
        ArrayList<T> list = (ArrayList<T>) o.readObject();
        return list;
    }
}
