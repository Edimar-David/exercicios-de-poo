package exercicioDePoo;

public class Livro implements Publicacao{
   private  String titulo;
   private  String autor;
   private  int totPaginas;
   private  int pagAtual;
   private  boolean aberto;
   private  Pessoa leitor;

    public void detalhes(){
        System.out.println(this.getTitulo());
        System.out.println("de: "+ this.getAutor());
        System.out.println("ele esta aberto? "+ this.aberto);
        System.out.println("Tem " + this.getTotPaginas() + "pags");
        System.out.println("O " + this.getLeitor() + " esta na pag"+ this.getPagAtual());
    }


    //construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }


    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor.getNome();
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    //implemenação
    @Override
    public void abrir() {
        if(this.isAberto() == false) {
            System.out.println("livro aberto");
            this.setAberto(true);
        }else{
            System.out.println("o livro ja esta aberto");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            System.out.println("livro fechado");
            this.setAberto(false);
        }else{
            System.out.println("o livro ja esta fechado");
        }
    }

    @Override
    public void folhear() {
        for (int i = 0; i < this.totPaginas; i++) {
            System.out.println("pagina "+ this.getPagAtual());
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }


}
