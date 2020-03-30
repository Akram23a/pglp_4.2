package PGL.pglp_4_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InterpreteurTest {
    
    @Test
    public void ajouterCommandeTest() {
        Interpreteur inter;
        Commande comm;
        Action act;

        act = new Action();
        comm = new Quit(act);
        inter = new Interpreteur();
        inter.ajouterCommande("quit", comm);

        String intitule = "quit";
        Commande com2 = inter.getCommandes().get(intitule);
        assertEquals(comm, com2);
    }
    
}
