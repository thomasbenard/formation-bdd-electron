import com.demo.bdd.CarteElectron;
import com.demo.bdd.Compte;
import com.demo.bdd.StatutTransaction;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Etque;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {

    private CarteElectron carteElectron;
    private Compte compte;
    private StatutTransaction statutTransaction;

    @Soit("une carte electron avec un plafond de {int}")
    public void uneCarteElectronAvecUnPlafondDe(int plafond) {
        carteElectron = new CarteElectron(plafond);

    }

    @Etque("mon compte a un solde de {int}")
    public void monCompteAUnSoldeDe(int solde) {
        compte = new Compte();
        compte.deposer(solde);
    }

    @Quand("je réalise un retrait de {int}")
    public void jeRéaliseUnRetraitDe(int montant) {
        statutTransaction = compte.retrait(carteElectron, montant);
    }

    @Et("un plafond de {string}")
    public void unPlafondDe(String arg0) {
    }

    @Alors("mon compte doit avoir un solde de {int}")
    public void monCompteDoitAvoirUnSoldeDe(int nouveauSolde) {
        assertEquals(nouveauSolde, compte.calculerSolde());
    }

    @Et("ma carte doit avoir un plafond de {int}")
    public void maCarteDoitAvoirUnPlafondDe(int nouveauPlafond) {
        assertEquals(nouveauPlafond, carteElectron.calculerPlafond());
    }

    @Et("la transaction est acceptée")
    public void laTransactionEstAcceptée() {
        assertEquals(StatutTransaction.ACCEPTEE, statutTransaction);
    }

    @Et("la transaction est refusée")
    public void laTransactionEstRefusée() {
    }
}
