package dariocecchinato.s19l3_design_patterns.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Info info = new Info("Aldo", "Baglio", LocalDate.of(1965, 5, 12));

        InfoAdapter infoadp = new InfoAdapter(info);

        String infoNomeCompleto = infoadp.getNomeCompleto();
        int infoeta=infoadp.getEta();

        System.out.println("il Nome Completo di info è " + infoNomeCompleto + " La sua età " + infoeta + " anni ");

    }
}
