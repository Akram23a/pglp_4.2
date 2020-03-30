package PGL.pglp_4_2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMoteurRPN {
    public MoteurRPN moteur = new MoteurRPN();
    /**
     * 
     */
    @Test
    public void ajouterOperande() {
        double A = 10;
        moteur.getPile().add((double) 10);
        double B = moteur.getPile().getLast();
        assertTrue(A == B);
    }
}
