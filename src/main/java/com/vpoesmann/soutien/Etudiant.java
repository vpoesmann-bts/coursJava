/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vpoesmann.soutien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sogeking
 */
public class Etudiant {
    
    private String nom;
    private String prenom;
    private int age;
    private String classe;
    private List<Chien> chiens;
    
    public Etudiant(String nom, String prenom, int age, String classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.classe = classe;
        this.chiens = new ArrayList<>();
    }
    
    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans et je suis en " + classe);
        for (int i = 0 ; i < chiens.size() ; i++) {
            chiens.get(i).sePresenter();
        }
    }
    
    public void ajouterChien(Chien p_chien) {
        chiens.add(p_chien);
    }
    
    public void retirerChien(int numeroChien) {
        chiens.remove(numeroChien);
    }
}
