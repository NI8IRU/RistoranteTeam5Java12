import classiPadreEdEnum.TipoRistoranteEnum;
import portate.Bevanda;
import portate.Dolce;
import portate.PrimoPiatto;
import portate.SecondoPiatto;

public class Main {

    public static void main(String[] args) {
                    //---------------TEST---------------//
        Menu menu = new Menu("Test", TipoRistoranteEnum.CARNIVORO);

        PrimoPiatto primoPiatto = new PrimoPiatto("Pasta", 13.4, 500);
        SecondoPiatto secondoPiatto = new SecondoPiatto("Carne", 20.2, 200.4);
        Dolce dolce = new Dolce("Dolce", 5.4, "4");
        Bevanda bevanda = new Bevanda("Acqua", 2.0, 0.0);

        menu.addPortata(dolce);
        menu.addPortata(primoPiatto);
        menu.addPortata(bevanda);
        menu.addPortata(secondoPiatto);

        menu.printMenu();
              //---------------Prova ad eseguire---------------//
                    //---------------TEST---------------//
    }
}
