/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan.java.Pertemuan3;
import java.util.Scanner;
/**
 *
 * @author WILLIAM
 */
public class AksiScanner {
    public static void main(String args[]) {
        // membuat objek baru
        ClassScanner scan = new ClassScanner();
        
        scan.inputScanner();
        System.out.println("\nNama Anda : " + scan.getnama());
        System.out.println("Nilai Anda : " + scan.rata());
    }
}
