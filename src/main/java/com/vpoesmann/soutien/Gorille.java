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
public class Gorille extends Animal {
    
    private String couleur;
    
    public Gorille(int taille, int age, String nom, String prenom, String espece, String couleur) {
        super(taille, age, nom, prenom, espece);
        this.couleur = couleur;
    }
}
