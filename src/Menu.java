import classiPadreEdEnum.ColorEnum;
import classiPadreEdEnum.Portata;
import classiPadreEdEnum.TipoRistoranteEnum;
import portate.Bevanda;
import portate.Dolce;
import portate.PrimoPiatto;
import portate.SecondoPiatto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {
    private String nome;
    private TipoRistoranteEnum tipo;
    private Double prezzo = 0.0;
    private List<Portata> portate;

    public Menu(String nome, TipoRistoranteEnum tipo) {
        this.nome = nome;
        this.tipo = tipo;
        portate = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoRistoranteEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoRistoranteEnum tipo) {
        this.tipo = tipo;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void addPortata(Portata portata) {
        portate.add(portata);
        portate.sort((u1, u2) -> {
            if (Objects.equals(u1.getPrezzo(), u2.getPrezzo()))
                return 0;
            return u1.getPrezzo() < u2.getPrezzo() ? -1 : 1;
        });
        portate.sort((u1, u2) -> {
            if (u1.getOrdinatore() == u2.getOrdinatore())
                return 0;
            return u1.getOrdinatore() < u2.getOrdinatore() ? -1 : 1;
        });
    }

    public void removePortata(Portata portata) {
        portate.remove(portata);
        portate.sort((u1, u2) -> {
            if (Objects.equals(u1.getPrezzo(), u2.getPrezzo()))
                return 0;
            return u1.getPrezzo() < u2.getPrezzo() ? -1 : 1;
        });
        portate.sort((u1, u2) -> {
            if (u1.getOrdinatore() == u2.getOrdinatore())
                return 0;
            return u1.getOrdinatore() < u2.getOrdinatore() ? -1 : 1;
        });
    }

    private void setPrezzoMenu() {
        for (Portata portata : portate) {
            prezzo += portata.getPrezzo();
        }
        prezzo = (double) Math.round(prezzo * 100) / 100;
    }

    public void printMenu() {
        setPrezzoMenu();
        boolean primoPrint = true;
        boolean secondoPrint = true;
        boolean dolcePrint = true;
        boolean bevandaPrint = true;
        System.out.println("                      "+nome+"                    ");
        System.out.println("╔═══════════════════ BY JAVA-12 TEAM-5 ═══════════════════╗");
        System.out.println("\n"+"  "+ tipo.getDescrizione());
        System.out.println("  Prezzo totale: " + prezzo + "€");
        for(Portata portata : portate) {
            if (portata instanceof PrimoPiatto && primoPrint) {
                System.out.println(ColorEnum.GIALLO.getAnsiCode() + "\n  PRIMI PIATTI" + ColorEnum.RESET.getAnsiCode());
                primoPrint = false;
            }
            if (portata instanceof SecondoPiatto && secondoPrint) {
                System.out.println(ColorEnum.CIANO.getAnsiCode() + "\n  SECONDI PIATTI" + ColorEnum.RESET.getAnsiCode());
                secondoPrint = false;
            }
            if (portata instanceof Dolce && dolcePrint) {
                System.out.println(ColorEnum.VIOLA.getAnsiCode() + "\n  DOLCI" + ColorEnum.RESET.getAnsiCode());
                dolcePrint = false;
            }
            if (portata instanceof Bevanda && bevandaPrint) {
                System.out.println(ColorEnum.BLU.getAnsiCode() + "\n  BEVANDE" + ColorEnum.RESET.getAnsiCode());
                bevandaPrint = false;
            }
            portata.printPortata();
        }
        System.out.println("\n╚════════════════════════════════════════════════════════╝\n");
    }
}