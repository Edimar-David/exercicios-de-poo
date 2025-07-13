package exercicioDePoo;

public class aula09{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(18, "Edimar", "Masc.");
        Livro l1 = new Livro("memorias postumas de Bras cubas","Machado de Assis",15,p1);

        l1.detalhes();
    }
}
