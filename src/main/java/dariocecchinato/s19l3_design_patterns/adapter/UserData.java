package dariocecchinato.s19l3_design_patterns.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int eta;

    public UserData() {

    }


    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
