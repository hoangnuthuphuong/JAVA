/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doan_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tim_kiem_mang_Nhi_phan {
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
        
        //Sap xep mang theo chieu tang dan
        Arrays.sort(c);
        System.out.println("Mang sau khi sap xep tang dan: "); 
        System.out.println(Arrays.toString(c));
        
        //Tim kiem
        System.out.print("Nhap vao gia tri can tim kiem: ");
        input = sc.nextLine();
        int x = Integer.parseInt(input);
        
        //Tim kiem nhi phan
        int index = Arrays.binarySearch(c, x);
        if (index < 0){
            System.out.println("Khong tim thay trong mang");}
        else{
            System.out.println("Tim thay tai vi tri thu "+ index);
        }
    }
}
