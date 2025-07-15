package polimorfismo.parte1;

public class aula12 {

    public static void main(String[] args) {

        mamifero m = new mamifero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        System.out.println("");
        System.out.println("mamiferos");
        m.setPeso(8.5);
        m.alimentar();
        m.emitirSom();
        m.locomover();

        System.out.println("");
        System.out.println("repitils");
        r.setPeso(8.5);
        r.alimentar();
        r.emitirSom();
        r.locomover();

        System.out.println("");
        System.out.println("peixes:");
        p.setPeso(8.5);
        p.alimentar();
        p.emitirSom();
        p.locomover();
        p.soltarBolhas();

        System.out.println("");
        System.out.println("aves:");
        a.setPeso(8.5);
        a.alimentar();
        a.emitirSom();
        a.locomover();
        a.fazerNinho();

    }
}
