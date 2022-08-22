/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
//    public static <T> List<T> doc(String file) {
//        List<T> list = new ArrayList<>();
//        try {
//            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
//            list = (List<T>) o.readObject();
//            o.close();
//        } catch (IOException | ClassNotFoundException e) {}
//        return list;
//    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String file = "DATA.in";
        Scanner sc = new Scanner(new FileInputStream(file));
        try {
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e){}
    }
}
