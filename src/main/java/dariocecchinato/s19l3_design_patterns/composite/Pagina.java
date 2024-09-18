package dariocecchinato.s19l3_design_patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pagina implements LibroInterfaccia{
    private int numeroPagina;

    @Override
    public void stampa() {
        System.out.println("Pagina" + numeroPagina);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
