/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan.java.Pertemuan3;

/**
 *
 * @author WILLIAM
 */
public class IfElseAksi {
    public static void main(String[]args){
        
        //Pembuatan objek baru dari class IfElseClass.Java
        IfElseClass ifclass = new IfElseClass();
        
        ifclass.setInputData();
        ifclass.getKeterangan();
        System.out.println("Hasil Akhir");
        System.out.println("=================================");
        System.out.println("Nama Siswa                : "+ifclass.nama);
        System.out.println("Nilai Akhir yang di dapat : "+ifclass.nilaiAkhir);
        System.out.println("Keterangan                : "+ifclass.getKeterangan());
        System.out.println("=================================");
    }
    
}
