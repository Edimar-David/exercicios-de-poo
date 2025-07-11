package lutalivre.cursoEmVideo;

public class Lutador {

    //atributos
    String nome;
    String nacionalidade;
    int idade;
    double altura;
    double peso;
    String categoria;
    int vitorias;
    int derrotas;
    int empate;

    //construtor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String categoria, int vitorias, int derrotas, int empate){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setCategoria(categoria);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpate(empate);

    }
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    //metodos

    public void apresentar(){
        System.out.println("de " + this.getNacionalidade());
        System.out.println("com "+ this.getIdade() +"anos, "+ this.getAltura() +"m de altura e pesando: "+ this.getPeso() + "Kgs");
        System.out.println("vem ai o lutador:" + this.getNome());
        this.status();

    }

    public void status(){
        System.out.println("estatisticas");
        System.out.println("vitorias: " + this.getVitorias());
        System.out.println("derrotas: " + this.getDerrotas());
        System.out.println("empates: " + this.getEmpate());
        System.out.println("===============================");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }
}
