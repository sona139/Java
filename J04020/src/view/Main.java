/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}

class Pair <K, V> {
    private K key;
    private V value;

    public Pair() {
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key; 
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    
    public boolean isPrime() {
        int inKey = Integer.parseInt(this.key.toString()), inVal = Integer.parseInt(this.value.toString());
        if (inKey < 2 || inVal < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(inKey); i++) {
            if (inKey%i == 0) {
                return false;
            }
        }
        
        for (int i= 2; i <= Math.sqrt(inVal); i++) {
            if (inVal%i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return this.key + " " + this.value;
    }
}
