package dariocecchinato.s19l3_design_patterns.adapter;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter extends UserData implements DataSource{
    private Info info;

    public InfoAdapter(Info info){
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return this.info.getNome()+ " " + this.info.getCognome();
    }

    @Override
    public int getEta() {
        return calcolaEta(info.getDataDiNascita());
    }

    private int calcolaEta(LocalDate dataDiNascita){
        LocalDate dataAttuale = LocalDate.now();
        return Period.between(dataDiNascita,dataAttuale).getYears();
    }


}
