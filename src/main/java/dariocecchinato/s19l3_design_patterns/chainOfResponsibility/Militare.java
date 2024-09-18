package dariocecchinato.s19l3_design_patterns.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Militare {
    private Militare next;


    public abstract int getStipendio();

    public abstract String getGrado();

    public void verificaStipendio(int importo) {
        if (getStipendio() >= importo) {
            System.out.println(getGrado() + " Ha uno stipendio di " + getStipendio());
            if (next != null){
                next.verificaStipendio(importo);
            }
        } else if (next != null) {
            System.out.println(getGrado() + " Ha uno stipendio più basso");
            next.verificaStipendio(importo);
        } else {
            System.out.println("Catena finita");
        }
    }
}