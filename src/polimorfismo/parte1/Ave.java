package polimorfismo.parte1;

public class Ave extends Animal{

    private String corPena;

    public void fazerNinho(){
        System.out.println("ninho feito");
    }

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("com frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("sons de aves");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
