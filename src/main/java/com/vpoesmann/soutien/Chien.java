/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vpoesmann.soutien;

/**
 *
 * @author sogeking
 */
public class Chien {
    
    private int taille;
    private int age;
    private String nom;
    private String race;
    
    public Chien(int taille, int age, String nom, String race) {
        this.taille = taille;
        this.age = age;
        this.race = race;
        this.nom = nom;
    }
    
    public void sePresenter() {
        System.out.println("Woof waf " + taille + " woof " + age + " waf waf woof " + nom + " woof waf " + race + ".");
    }
    
    public String toString() {
        return nom + " " + race;
    }
}
