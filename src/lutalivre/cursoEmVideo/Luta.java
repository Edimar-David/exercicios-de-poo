package lutalivre.cursoEmVideo;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desfiante;
    private int rounds;
    private boolean aprovado;

    public  void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() .equals(l2.getCategoria())){
            this.setAprovado(true);
            this.desafiado = l1;
            this.desfiante = l2;
        }else{
            System.out.println("a luta não pode ocorrer");
            this.setAprovado(false);
            this.desafiado = null;
            this.desfiante = null;

        }
    }
    public void lutar(){
        if(this.isAprovado()){
            desafiado.apresentar();
            desfiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("ouve um empate");
                    this.desafiado.empatarLuta();
                    this.desfiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do "+ this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desfiante.perderLuta();
                    break;
                case 2:
                    System.out.println("vitoria do" + this.desfiante.getNome());
                    this.desfiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }


        }else{
            System.out.println("a luta não pode ocorrer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesfiante() {
        return desfiante;
    }

    public void setDesfiante(Lutador desfiante) {
        this.desfiante = desfiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprova) {
        this.aprovado = aprova;
    }
}
