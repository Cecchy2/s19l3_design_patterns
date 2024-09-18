package dariocecchinato.s19l3_design_patterns.chainOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Militare tenente = new Tenente();
        Militare capitano = new Capitano();
        Militare maggiore = new Maggiore();
        Militare colonnello = new Colonnello();
        Militare generale = new Generale();

        tenente.setNext(capitano);
        capitano.setNext(maggiore);
        maggiore.setNext(colonnello);
        colonnello.setNext(generale);

        int importo = 2000;
        System.out.println("Verifica per un importo di: " + importo);
        tenente.verificaStipendio(importo);
    }
}