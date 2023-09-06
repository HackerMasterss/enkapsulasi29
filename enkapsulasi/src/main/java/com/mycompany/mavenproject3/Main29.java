/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author acer
 */
public class Main29 {
    
    public static void main(String[] args) {
        // hitung luas segitiga ADE 
        Segitiga29 segitiga29 = new Segitiga29();
        segitiga29.setAlas29(5);
        segitiga29.setTinggi29(7);
        double luasADE = segitiga29.getLuas29();
         
        // hitung luas segitiga CBF 
        Segitiga29 segitiga08 = new Segitiga29();
        segitiga08.setAlas29(5);
        segitiga08.setTinggi29(7);
        double luasCBF = segitiga08.getLuas29();
         
        // hitung luas persegipanjang CDEF
        persegipanjang29 persegipanjang = new persegipanjang29();
        persegipanjang.setPanjang29(35);
        persegipanjang.setLebar29(7);
        double luasCDEF = persegipanjang.getLuas();
         
        // hitung luas setengah lingkaran X
        lingkaran29 lingkaran = new lingkaran29();
        lingkaran.setjarijari29(7);
        double luasX = 0.5 * lingkaran.getLuas29();
         
        // hitung luas daerah diarsir
        double luasArsir = luasADE + luasCBF + luasCDEF - luasX;
        System.out.println("Luas daerah diarsir: " + luasArsir + " cm2");
    }
}
