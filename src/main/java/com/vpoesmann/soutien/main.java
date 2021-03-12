package com.vpoesmann.soutien;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sogeking
 */
public class main {
    public static void main(String[] args) {
        Chien un = new Chien(40, 12, "Plouf", "Fox terrier");
        Chien deux = new Chien(40, 12, "Splash", "Yorkshire");

        Cochon bertha = new Cochon("Bertha", 90, 15);
        Gorille harambe = new Gorille("Kong", "Harambe", "Gorille", 10);
        
        Etudiant jimmy = new Etudiant("DOUSSAIN", "Jimmy", 19, "BTS SIO1");
        List<Chien> chenil = new ArrayList<Chien>();
        chenil.add(un);
        chenil.add(deux);
        jimmy.ajouterChien(un);
        jimmy.ajouterChien(deux);
        jimmy.retirerChien(0);
        jimmy.sePresenter();
        jimmy.setCochon(bertha);
        jimmy.setGorille(harambe);
        jimmy.getCochon().attaquer();
    }
}
