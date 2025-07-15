package polimorfismo.parte1;

public class Peixe extends Animal{

    private String corDeEscama;

    public void soltarBolhas(){
        System.out.println("soltando bolhas");
    }

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de peixes");
    }
}
