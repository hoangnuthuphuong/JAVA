/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doan_1;
/**
 *
 * @author Admin
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sinh_ngau_nhien_Va_Sap_xep_tang_giam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong phan tu cua mang n = ");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        int[] c = new int[n];

        //Sinh ngau nhien
        Random rnd = new Random();
        for(int i = 0; i < n; i++){
            c[i] = rnd.nextInt(1000);
        }
        System.out.print("Mang ban dau: ");
        System.out.println(Arrays.toString(c));

        //Sap xep va hien thi ket qua
        int temp;
        for(int i = 0; i< n-1; i++)
            for(int j=i +1; j < n; j++) {
                if(c[i] > c[j]) {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        System.out.print("Mang tang dan: ");
        System.out.println(Arrays.toString(c));
        
        //Cach sap xep khac
//        Arrays.sort(c);
//        System.out.println(Arrays.toString(c));
}
}
