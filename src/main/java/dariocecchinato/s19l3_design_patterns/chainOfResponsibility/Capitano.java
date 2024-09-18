package dariocecchinato.s19l3_design_patterns.chainOfResponsibility;




public class Capitano extends Militare{
    private int stipendio = 2000;
    private String grado = "Capitano";

    @Override
    public int getStipendio() {
        return stipendio;
    }

    @Override
    public String getGrado() {
        return grado;
    }
}
