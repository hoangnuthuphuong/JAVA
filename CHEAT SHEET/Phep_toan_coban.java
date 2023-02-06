/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doan_1;

/**
 *
 * @author Admin
 */
public class Phep_toan_coban {
    public static void main(String[] args) {
        //Cac phep toan voi so nguyen
        int a = 17, b = 9, c;
        c = a + b;
        System.out.println("Phep cong " + a + "+" + b + "=" + c);
        c = a - b;
        System.out.println("Phep tru " + a + "-" + b + "=" + c);
        c = a * b;
        System.out.println("Phep nhan " + a + "*" + b + "=" + c);
        c = a / b;
        System.out.println("Phep chia lay phan nguyen " + a + "/" + b + "=" + c);
        c = a % b;
        System.out.println("Phep chia lay phan du " + a + "%" + b + "=" + c);
        
        
        // Cac phep toan voi so thuc
        double x = 17.9, y = 1.15, z;
        z = x + y;
        System.out.println("Phep cong " + x + "+" + y + "=" + z);
        z = x - y;
        System.out.println("Phep tru " + x + "-" + y + "=" + z);
        z = x * y;
        System.out.println("Phep nhan " + x + "*" + y + "=" + z);
        z = x / y;
        System.out.println("Phep chia " + x + "/" + y + "=" + z);
        
        
        //Cac phep toan logic
        boolean flag1 = true, flag2 = false, flag3 = true;
        System.out.println("Phep AND " + (flag1 && flag2));
        System.out.println("Phep OR " + (flag1 || flag2));
        System.out.println("Phep NOT " + (!flag1));
        System.out.println("Phep XOR " + (flag1 ^ flag3));
        
        //Cac phep toan co ban tren chuoi
        String s1 = "HoangNuthuphuong";
        String s2 = "thuphuong";
        
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.contains(s2));
        s1 += " " + s2;
        System.out.println(s1);
    }
}
