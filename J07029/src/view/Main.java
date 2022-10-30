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

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        ArrayList<Integer> list = IOFile.read("DATA.in");
        int[] m = new int[1000001];
        Arrays.fill(m, 0);
        list.forEach(i -> {
            m[i]++;
        });
        int[] primes = new int [1000001];
        Arrays.fill(primes, 1);
        primes[0] = primes[1] = 0;
        for (int i = 2; i <= 1000; i++)
            if(primes[i] == 1)
                for (int j = i*i; j <= 1000000; j+=i)
                    primes[j] = 0;
        int cnt = 0;
        for (int i = 1000000; i >= 0; i--) {
            if(primes[i] == 1 && m[i] != 0) {
                System.out.println(i + " " + m[i]);
                cnt++;
            }
            if(cnt == 10) break;
        }
    }
    
}

class IOFile {
    public static <T> ArrayList<T> read(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
        ArrayList<T> list = (ArrayList<T>) o.readObject();
        return list;
    }
}
