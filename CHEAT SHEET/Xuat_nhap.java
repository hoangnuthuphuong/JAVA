/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

package com.mycompany.doan_1;
import java.util.Scanner;

public class Xuat_nhap {
    public static void main(String[] args) {
        boolean flag = true;
        int a = 17;
        byte b = 9;
        double c = 17.9;
        float d = 1.5f;
        String e = "Thu Phuong";
        char f = 'P';
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String chuoi = sc.nextLine();
        System. out.println("Ket qua da nhap:" + chuoi);
    
        System.out.print("Nhap vao mot so nguyen: ");
        String input = sc.nextLine();
        a = Integer.parseInt(input);
        System. out.println("Ket qua da nhap:" + a);
        
        System.out.print("Nhap vao mot so thuc: ");
        input = sc.nextLine();
        c = Double.parseDouble(input);
        System. out.println("Ket qua da nhap:" + c);
    }
}
