package dariocecchinato.s19l3_design_patterns.chainOfResponsibility;

public class Tenente extends Militare{
    private int stipendio= 1000;
    private String grado = "Tenente";


    @Override
    public int getStipendio() {
        return stipendio;
    }

    @Override
    public String getGrado() {
        return grado;
    }
}
