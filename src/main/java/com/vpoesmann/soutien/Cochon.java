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
public class Cochon {
    private String prenom;
    private int taille;
    private int age;
    
    public Cochon(String prenom, int taille, int age) {
        this.prenom = prenom;
        this.taille = taille;
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void attaquer() {
        System.out.println(prenom + " attaque !");
    }
}
