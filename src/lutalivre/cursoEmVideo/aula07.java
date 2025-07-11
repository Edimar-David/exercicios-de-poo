package lutalivre.cursoEmVideo;

public class aula07{
    public static void main(String[] args) {
        //peso leve
        Lutador l1 = new Lutador("Pretty Boy" ,"França",   31,1.75,68.9,"leve",11,2,1);
        Lutador l2 = new Lutador("Put Script" ,"Brasil",   29,1.68,57.8,"leve",14,2,3);
        //peso medio
        Lutador l3 = new Lutador("Snap Shadow","EUA"     ,35,1.65,80.9,"medio",12,2,1);
        Lutador l4 = new Lutador("Dead Code"  ,"Austalia",28,1.93,81.6,"medio",13,0,2);
        //peso pesado
        Lutador l5 = new Lutador("Ufo Cobol","Brasil",37,1.70,119.3,"pesado",5,4,3);
        Lutador l6 = new Lutador("Nerdaard","EUA",30,1.81,105.7,"pesado",12,2,4);


        System.out.println("//============//luta 1\\============\\");
  /*      System.out.println("de um lado:");
        l1.apresentar();

        System.out.println("do outro lado");
        l2.apresentar();
*/
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l1, l1);
        UEC01.lutar();
    }
}
