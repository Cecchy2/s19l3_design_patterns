package dariocecchinato.s19l3_design_patterns.chainOfResponsibility;


public class Generale extends Militare{
    private int stipendio = 5000;
    private String grado = "Generale";

    @Override
    public int getStipendio() {
        return stipendio;
    }

    @Override
    public String getGrado() {
        return grado;
    }
}
