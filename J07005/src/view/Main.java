/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws IOException{
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] cnt = new int[1000];
        Arrays.fill(cnt, 0);
        for (int i = 0; i < 100000; i++)
            cnt[dt.readInt()]++;
        for (int i = 0; i < 1000; i++)
            if(cnt[i] > 0)
                System.out.println(i + " " + cnt[i]);
    }
}
