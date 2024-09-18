package dariocecchinato.s19l3_design_patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Sezione implements LibroInterfaccia{
    private List<Sezione> sezioni = new ArrayList<>();
    private List<Pagina> pagine = new ArrayList<>();


    @Override
    public void stampa() {

    }

    @Override
    public int getNumeroPagine() {
        return 0;
    }
}
