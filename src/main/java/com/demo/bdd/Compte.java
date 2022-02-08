package com.demo.bdd;

import static com.demo.bdd.StatutTransaction.ACCEPTEE;

public class Compte {
    public Compte() {
    }

    public void deposer(int montant) {

    }

    public StatutTransaction retrait(CarteElectron carteElectron, int montant) {

        return ACCEPTEE;
    }

    public int calculerSolde() {
        return 0;
    }
}
