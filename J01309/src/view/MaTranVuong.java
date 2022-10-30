/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class MaTranVuong {
    int n;
    int[][] mt;

    public MaTranVuong() {
    }

    public MaTranVuong(int n, int[][] mt) {
        this.n = n;
        this.mt = mt;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getMt() {
        return mt;
    }

    public void setMt(int[][] mt) {
        this.mt = mt;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cap cua ma tran: ");
        this.n = sc.nextInt();
        mt = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap hang thu " + i + " cua ma tran: ");
            for (int j = 0; j < n; j++)
                mt[i][j] = sc.nextInt();
        }
    }
    
    public void maTranChuyenVi() {
        if (n == 0) {
            System.out.println("Ban chua nhap ma tran!");
            return ;
        }
        System.out.println("Ma tran chuyen vi la:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mt[j][i] + " ");
            System.out.println("");
        }
    }
    
    public void hangHoacCotCoTongLonNhat() {
        if (n == 0) {
            System.out.println("Ban chua nhap ma tran!");
            return ;
        }
        int[] sumRow = new int[n], sumCol = new int[n];
        Arrays.fill(sumRow, 0);
        Arrays.fill(sumCol, 0);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                sumCol[i] += mt[j][i];
                sumRow[i] += mt[i][j];
            }
        int rowMax = 0, colMax = 0;
        for (int i = 1; i < n; i++) {
            if(sumRow[i] > sumRow[rowMax]) rowMax = i;
            if(sumCol[i] > sumCol[colMax]) colMax = i;
        }
        if(sumCol[colMax] > sumRow[rowMax])
            System.out.println("Cot co tong cac so lon nhat la cot " + colMax + ", tong = " + sumCol[colMax]);
        else System.out.println("Hang co tong cac so lon nhat la hang " + rowMax + ", tong = " + sumRow[rowMax]);
    }
    
    public void hangChan() {
        if (n == 0) {
            System.out.println("Ban chua nhap ma tran!");
            return ;
        }
        int row = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++)
                if(mt[i][j]%2 == 0 && mt[i][j] > 0) cnt++;
                else break;
            if(cnt == n) {
                row++;
                System.out.print("Hang chan thu " + row + ": ");
                for (int j = 0; j < n; j++)
                    System.out.print(mt[i][j] + " ");
                System.out.println("");
            }
        }
        if(row == 0) {
            System.out.println("Khong co hang nao cac phan tu deu chan");
        }
    }
    
    public void reduction(float[][] mt, int pivot, int col) {
        int i, j;
        float factor;
        factor = mt[pivot][col];

        for (i = 0; i < 2*n; i++)
           mt[pivot][i] /= factor;

        for (i = 0; i < n; i++)
           if (i != pivot) {
              factor = mt[i][col];
              for (j = 0; j < 2*n; j++)
                 mt[i][j] -= mt[pivot][j] * factor;
        }
    }
    
    public void matranNghichDao() {
        if (n == 0) {
            System.out.println("Ban chua nhap ma tran!");
            return ;
        }
        
        float[][] newMt = new float[n][n*2];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2*n; j++)
                if(j == i+n) newMt[i][j] = 1;
                else newMt[i][j] = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                newMt[i][j] = mt[i][j];
        for (int i = 0; i < n; i++)
            reduction(newMt, i, i);
        System.out.println("Ma tran nghich dao la:");
        for (int i = 0; i < n; i++) {
            for (int j = n; j < 2*n; j++)
                System.out.format("%8.3f ", newMt[i][j]);
            System.out.println("");
        }
   }
}
