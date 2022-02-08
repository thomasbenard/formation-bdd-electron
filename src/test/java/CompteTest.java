import com.demo.bdd.CarteElectron;
import com.demo.bdd.Compte;
import org.junit.jupiter.api.Test;

import static com.demo.bdd.StatutTransaction.ACCEPTEE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CompteTest {

    @Test
    void transaction_acceptee_quand_solde_suffisant() {
        Compte compte = unCompteAvecUnSoldeInitialDe(5);
        CarteElectron carteElectron = new CarteElectron(2);
        assertEquals(ACCEPTEE, compte.retrait(carteElectron, 1));
    }

    @Test
    void todo() {
        Compte compte = unCompteAvecUnSoldeInitialDe(5);
        CarteElectron carteElectron = new CarteElectron(2);
        compte.retrait(carteElectron, 1);
        assertEquals(1, carteElectron.calculerPlafond());
    }


    @Test
    void todo2() {
        Compte compte = unCompteAvecUnSoldeInitialDe(5);
        CarteElectron carteElectron = new CarteElectron(3);
        compte.retrait(carteElectron, 1);
        assertEquals(2, carteElectron.calculerPlafond());
    }

    private static Compte unCompteAvecUnSoldeInitialDe(int montant) {
        Compte compte = new Compte();
        compte.deposer(montant);
        return compte;
    }
}
