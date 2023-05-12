import enumertion.ColorEnum;
import enumertion.OrdinatoreEnum;
import enumertion.TipoEnum;
import portate.Portata;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nome;
    private TipoEnum tipo;

    private final List<Portata> portate;

    public Menu(String nome, TipoEnum tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.portate = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public void addPortata(Portata portata) {
        portate.add(portata);
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

    public Double calculatePrice() {
        Double prezzo = 0.0;
        for (Portata portata : portate) {
            prezzo += portata.getPrezzo();
        }
        return (double) Math.round(prezzo * 100) / 100;
    }

    //TODO sistemare
    //Regolarizzata la nuova funzione printMenu, rimane solo da abbellire la formattazione del testo
    public void printMenu() {
        System.out.println(tipo.getDescrizione() + "\n");
        System.out.println("\n PRIMI \n");
        portate.stream().filter(primo -> primo.getOrdinatore() == OrdinatoreEnum.PRIMA_POSIZIONE.getPosizionePortataSulMenu()).forEach(Portata::printPortata);
        System.out.println("\n SECONDI \n");
        portate.stream().filter(secondo -> secondo.getOrdinatore() == OrdinatoreEnum.SECONDA_POSIZIONE.getPosizionePortataSulMenu()).forEach(Portata::printPortata);
        System.out.println("\n DESSERT \n");
        portate.stream().filter(dessert -> dessert.getOrdinatore() == OrdinatoreEnum.TERZA_POSIZIONE.getPosizionePortataSulMenu()).forEach(Portata::printPortata);
        System.out.println("\n BEVANDE \n");
        portate.stream().filter(bevanda -> bevanda.getOrdinatore() == OrdinatoreEnum.QUARTA_POSIZIONE.getPosizionePortataSulMenu()).forEach(Portata::printPortata);
        System.out.println("\n BUON APPETITO!!!");
    }

    //TODO rivediamo
    //Overload della funzione printMenu
//Questo metodo stampa i menù colorati in base al tipo
    public void printMenu(ColorEnum colorEnum, TipoEnum tipoEnum) {
        //TODO rivediamo il passaggio di oggetti e come possiamo usare questo metodo
        System.out.println(this.tipo.getColore().getAnsiCode());
        System.out.println(ColorEnum.NERO.getAnsiCode());
        System.out.println(tipo.getDescrizione() + "\n");
        System.out.println("\n PRIMI \n");
        portate.stream().filter(primo -> primo.getOrdinatore() == OrdinatoreEnum.PRIMA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n SECONDI \n");
        portate.stream().filter(secondo -> secondo.getOrdinatore() == OrdinatoreEnum.SECONDA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n DESSERT \n");
        portate.stream().filter(dessert -> dessert.getOrdinatore() == OrdinatoreEnum.TERZA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n BEVANDE \n");
        portate.stream().filter(bevanda -> bevanda.getOrdinatore() == OrdinatoreEnum.QUARTA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println(ColorEnum.RESET.getAnsiCode());
    }
}