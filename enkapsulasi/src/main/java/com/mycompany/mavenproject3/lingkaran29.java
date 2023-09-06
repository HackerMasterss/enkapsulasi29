/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author acer
 */
public class lingkaran29 {
    // atribut
    private int jarijari;
    private double luas;
     
    // setter method untuk jarijari
    public void setjarijari29(int r){
        if (r > 0){
            this.jarijari = r;
        } else {
            this.jarijari = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas29(){
        // hitung luasnya
        this.luas = Math.PI * Math.pow(this.jarijari, 2);
        return this.luas;
    }
}
    

