package com.vpoesmann.soutien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sogeking
 */
public class MaClasse {
    
    private int compteur;
    
    public int getCompteur() {
        return compteur;
    }
    
    public void setCompteur(int p_compteur) {
        if (p_compteur < 0) {
            compteur = 0;
        } else {
            compteur = p_compteur;
        }
    }
    
    public MaClasse(int p_compteur) {
        compteur = p_compteur;
    }
    
    public void start() {
        compteur++;
    }
    
    public void stop() {
        
    }
    
    public void RAZ() {
        
    }
}
