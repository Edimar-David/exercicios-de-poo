package pooCursoEmVideo.Aula2;

public class Controle implements Controlador{

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;



    //controlador
    public Controle(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    //getters e setters
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    //implementação da interface
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("esta ligado? " + this.getLigado());
        System.out.println("esta tocando? " + this.getTocando());
        System.out.print("Volume: ");
        int volume = this.getVolume();
        for (int i = 0; i < volume; i+= 10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("==================");
        System.out.println("  fechando menu...");
        System.out.println("==================");
    }

    @Override
    public void maisVolume() {
        int volume = this.getVolume();
        boolean isLigado = this.getLigado();
        if(isLigado){
            if(volume < 100){
                this.setVolume(getVolume() + 10);
            }else{
                System.out.println("volume no maximo");
            }
        }else{
            System.out.println("Não é possivel aumentar o volume com a TV desligada");
        }
    }

    @Override
    public void menosVolume() {
        int volume = this.getVolume();
        boolean isLigado = this.getLigado();
        if(isLigado){
            if(volume > 0){
                this.setVolume(getVolume() - 10);
            }else{
                System.out.println("volume no minimo");
            }
        }else{
            System.out.println("Não é possivel aumentar o volume com a TV desligada");
        }
    }

    @Override
    public void ligarAudio() {

        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void desligarAudio() {
        if(this.getLigado() && this.volume > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}