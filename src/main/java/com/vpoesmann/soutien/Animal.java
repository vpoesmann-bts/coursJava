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
public class Animal {
    protected int taille;
    protected int age;
    protected String nom;
    protected String prenom;
    protected String espece;

    public Animal(int taille, int age, String nom, String prenom, String espece) {
        this.taille = taille;
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
        this.espece = espece;
    }
    
    public int getTaille() {
        return taille;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEspece() {
        return espece;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }
    
    
}
