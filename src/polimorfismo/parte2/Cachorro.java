package polimorfismo.parte2;

public class Cachorro {

    public void reagir(String frase){
        if(frase.equals("boa")){
            System.out.println("abanar o rabo");
        }else{
            System.out.println("rosnar");
        }
    }

    public void reagir(int hora, int minuto){
        if (hora < 12){
            System.out.println("abanaro rabo");
        } else if (hora >= 18){
            System.out.println("ignorar");
        }else{
            System.out.println("latir");
        }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("abanar o rabo");
        }else {
            System.out.println("rosnar");
        }
    }

}
