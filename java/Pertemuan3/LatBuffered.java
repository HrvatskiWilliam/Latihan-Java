/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan.java.Pertemuan3;
import java.io.*;
/**
 *
 * @author WILLIAM
 */
public class LatBuffered {
    public static void main(String args[]) throws Exception {
        //membuat objek baru
        InputStreamReader keyreader = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader (keyreader);
        // deklarasi variabel
        String kata1,kata2;
        
        System.out.print("Masukkan Kata Pertama : ");
        kata1= input.readLine();
        System.out.print("Masukkan Kata Kedua : ");
        kata2 = input.readLine();
        System.out.println("\nHasil Input String " + kata1 + " " + kata2);
                
    }
    
}
