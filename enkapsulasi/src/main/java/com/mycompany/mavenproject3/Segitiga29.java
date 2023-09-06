/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author acer
 */
public class Segitiga29 {
    // atribut 
    private int alassegitiga;
    private int tinggisegitiga;
    private double luassegitiga;
     
    // setter method untuk alas
    public void setAlas29(int a){
        if (a > 0){
            this.alassegitiga = a;
        } else {
            this.alassegitiga = 0;
        }
    }
     
    // setter method untuk tinggi
    public void setTinggi29(int t){
        if (t > 0){
            this.tinggisegitiga = t;
        } else {
            this.tinggisegitiga = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas29(){
        // hitung luasnya
        this.luassegitiga = this.alassegitiga * this.tinggisegitiga * 0.5;
        return this.luassegitiga;
    }
}
    

