package ristorante;

import enumeration.ColorEnum;
import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;
import portate.Portata;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nome;

    private final TipoEnum tipoEnum;
    private final List<Portata> portate;

    public Menu(String nome, TipoEnum tipoEnum) {
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

        if (portata.getTipoEnum() == this.tipoEnum || portata.getTipoEnum() == TipoEnum.ALL) {
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

        if (portata.getTipoEnum() == this.tipoEnum || portata.getTipoEnum() == TipoEnum.ALL) {
            portate.remove(portata);
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

    public void printMenu() {

        System.out.println(tipoEnum.getColoreTipo().getAnsiCode());
        System.out.println(ColorEnum.NERO.getAnsiCode());
        System.out.println(portate.get(0).getTipoEnum().getDescrizione() + ", prezzo totale: " + calculatePrice() + "€ \n");
        System.out.println("\n PRIMO \n");
        portate.stream().filter(primo -> primo.getOrdinatore() == OrdinatoreEnum.PRIMA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n SECONDO \n");
        portate.stream().filter(secondo -> secondo.getOrdinatore() == OrdinatoreEnum.SECONDA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n DOLCE \n");
        portate.stream().filter(dolce -> dolce.getOrdinatore() == OrdinatoreEnum.TERZA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println("\n BEVANDE \n");
        portate.stream().filter(bevanda -> bevanda.getOrdinatore() == OrdinatoreEnum.QUARTA_POSIZIONE).forEach(Portata::printPortata);
        System.out.println(ColorEnum.RESET.getAnsiCode());
    }
}