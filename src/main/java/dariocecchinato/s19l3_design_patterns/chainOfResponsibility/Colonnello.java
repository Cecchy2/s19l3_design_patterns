package dariocecchinato.s19l3_design_patterns.chainOfResponsibility;



public class Colonnello extends Militare{
    private int stipendio = 4000;
    private String grado = "Colonnello";

    @Override
    public int getStipendio() {
        return stipendio;
    }

    @Override
    public String getGrado() {
        return grado;
    }
}
