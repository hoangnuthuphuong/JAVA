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
public class Tim_kiem {
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
        
        //Tim kiem
        System.out.print("Nhap vao gia tri can tim kiem: ");
        input = sc.nextLine();
        int x = Integer.parseInt(input);
        
        boolean flag = false;
        
        for(int i = 0; i < c.length; i++){
            if(c[i]==x){
                System.out.print("Gia tri can tim co trong mang tai vi tri so " + i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Gia tri can tim kiem khong co trong mang");
        }
}
}