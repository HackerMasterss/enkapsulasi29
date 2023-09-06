/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author acer
 */
public class persegipanjang29 {
    // atribut
    private int panjangpersegipanjang;
    private int lebarpersegipanjang;
    private double luas;
     
    // setter method untuk panjang
    public void setPanjang29(int p){
        if (p > 0){
            this.panjangpersegipanjang = p;
        } else {
            this.panjangpersegipanjang = 0;
        }
    }
     
    // setter method untuk lebar
    public void setLebar29(int l){
        if (l > 0){
            this.lebarpersegipanjang = l;
        } else {
            this.lebarpersegipanjang = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas(){
        // hitung luasnya
        this.luas = this.panjangpersegipanjang * this.lebarpersegipanjang;
        return this.luas;
    }
}

