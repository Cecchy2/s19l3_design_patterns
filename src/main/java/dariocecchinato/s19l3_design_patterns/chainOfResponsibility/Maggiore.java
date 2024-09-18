package dariocecchinato.s19l3_design_patterns.chainOfResponsibility;




public class Maggiore extends Militare{
    private int stipendio = 3000;
    private String grado = "Maggiore";

    @Override
    public int getStipendio() {
        return stipendio;
    }

    @Override
    public String getGrado() {
        return grado;
    }
}
