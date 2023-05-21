import enumertion.ColorEnum;
import enumertion.OrdinatoreEnum;
import enumertion.TipoEnum;
import portate.Portata;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nome;

    private TipoEnum tipoEnum;
    private final List<Portata> portate;

    public Menu(String nome,TipoEnum tipoEnum) {
        this.nome = nome;
        this.tipoEnum = tipoEnum;
        this.portate = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addPortata(Portata portata) {

        if (portata.getTipoEnum() == this.tipoEnum || portata.getTipoEnum() == TipoEnum.ALL){
            portate.add(portata);
        }

        portate.sort((u1, u2) -> {
            if (u1.getPrezzo().equals(u2.getPrezzo()))
                return 0;
            return u1.getPrezzo() < u2.getPrezzo() ? -1 : 1;
        });
        portate.sort((u1, u2) -> {
            if (u1.getOrdinatore() == u2.getOrdinatore())
                return 0;
            return u1.getOrdinatore().getPosizionePortataSulMenu() < u2.getOrdinatore().getPosizionePortataSulMenu() ? -1 : 1;
        });
    }

    public void removePortata(Portata portata) {

        if (portata.getTipoEnum() == this.tipoEnum || portata.getTipoEnum() == TipoEnum.ALL){
            portate.add(portata);
        }

        portate.remove(portata);
        portate.sort((u1, u2) -> {
            if (u1.getPrezzo().equals(u2.getPrezzo()))
                return 0;
            return u1.getPrezzo() < u2.getPrezzo() ? -1 : 1;
        });
        portate.sort((u1, u2) -> {
            if (u1.getOrdinatore() == u2.getOrdinatore())
                return 0;
            return u1.getOrdinatore().getPosizionePortataSulMenu() < u2.getOrdinatore().getPosizionePortataSulMenu() ? -1 : 1;
        });
    }
    public TipoEnum getTipo() {
        return portate.get(0).getTipoEnum();
    }

    public Double calculatePrice() {
        Double prezzo = 0.0;
        for (Portata portata : portate) {
            prezzo += portata.getPrezzo();
        }
        return (double) Math.round(prezzo * 100) / 100;
    }


    //Regolarizzata la funzione printMenu, rimane solo da abbellire la formattazione del testo
    public void printMenu() {

        System.out.println(portate.get(0).getTipoEnum().getDescrizione() + "\n");
        System.out.println("\n PRIMI \n");
        portate.stream().filter(primo -> primo.getOrdinatore() == OrdinatoreEnum.PRIMA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n SECONDI \n");
        portate.stream().filter(secondo -> secondo.getOrdinatore() == OrdinatoreEnum.SECONDA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n DOLCE \n");
        portate.stream().filter(dolce -> dolce.getOrdinatore() == OrdinatoreEnum.TERZA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n BEVANDE \n");
        portate.stream().filter(bevanda -> bevanda.getOrdinatore() == OrdinatoreEnum.QUARTA_POSIZIONE).forEach(Portata::printPortata);
    }


    //Overload della funzione printMenu
   //Questo metodo stampa i menù colorati - !

    public void printMenu(ColorEnum colorEnum) {

        System.out.println(colorEnum.getAnsiCode());
        System.out.println(ColorEnum.NERO.getAnsiCode());
        System.out.println(portate.get(0).getTipoEnum().getDescrizione() + "\n");
        System.out.println("\n PRIMI \n");
        portate.stream().filter(primo -> primo.getOrdinatore() == OrdinatoreEnum.PRIMA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n SECONDI \n");
        portate.stream().filter(secondo -> secondo.getOrdinatore() == OrdinatoreEnum.SECONDA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n DOLCE \n");
        portate.stream().filter(dolce -> dolce.getOrdinatore() == OrdinatoreEnum.TERZA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n BEVANDE \n");
        portate.stream().filter(bevanda -> bevanda.getOrdinatore() == OrdinatoreEnum.QUARTA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println(ColorEnum.RESET.getAnsiCode());
    }
}