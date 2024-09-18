package dariocecchinato.s19l3_design_patterns.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Pagina pagina1 = new Pagina(1);
        Pagina pagina2 = new Pagina(2);
        Pagina pagina3 = new Pagina(3);

        Sezione sezione1 = new Sezione("Introduzione", List.of(pagina1, pagina2));
        Sezione sezione2 = new Sezione("Capitolo 1", List.of(pagina3));

        Autore autore1 = new Autore("Mario Rossi");

        Libro libro = new Libro(List.of(autore1), List.of(sezione1, sezione2), 29.99);

        libro.stampa();
        System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());
    }
}
