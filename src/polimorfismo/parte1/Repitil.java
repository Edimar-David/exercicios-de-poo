package polimorfismo.parte1;

public class Repitil extends Animal{

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo folhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
