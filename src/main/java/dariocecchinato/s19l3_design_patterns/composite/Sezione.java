package dariocecchinato.s19l3_design_patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Sezione implements LibroInterfaccia{

    private String nomeSezione;
    private List<LibroInterfaccia> elementi = new ArrayList<>();



    @Override
    public void stampa() {
        elementi.forEach(System.out::println);
    }
    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (LibroInterfaccia elemento: elementi){
            numeroPagine += elemento.getNumeroPagine();
        }
        return numeroPagine;
    }
}
