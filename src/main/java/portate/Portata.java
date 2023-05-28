
package portate;

import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;

/**
 * Creazione: 17/04/2023
 * Classe astratta che presenta le essenziali particolarità di una portata,
 * verrà usata per creare delle classi figlie che estenderanno i suoi metodi
 * per poi modificarli
 */
public abstract class Portata {

    /**
     * Campo che servirà per identificare le portate
     * presenti nel database
     */
    private int id;
    private String nome;
    private Double prezzo;

    /**
     * Campo che verrà aggiunto nel costruttore della classe e che
     * servirà per identificare il tipo della portata di ogni classe figlia
     */
    private final TipoEnum tipoEnum;

    /**
     * Parametro che verrà aggiunto nel costruttore della classe
     * e che verrà in seguito definita in OGNI super
     * delle classi figlie di 'Portata'!
     */
    private final OrdinatoreEnum ordinatore;

    /**
     * @param nome       nome della portata
     * @param prezzo     prezzo della portata
     * @param tipoEnum   tipo della portata
     * @param ordinatore campo che verrà definito in ogni super delle classi figlie
     *                   in modo da determinare la loro posizione sul menù
     */
    public Portata(String nome, Double prezzo, TipoEnum tipoEnum, OrdinatoreEnum ordinatore) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipoEnum = tipoEnum;
        this.ordinatore = ordinatore;
    }

    /**
     * @return il nome della portata
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter per il nome della portata, accetta solo stringhe
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return il prezzo della portata
     */
    public Double getPrezzo() {
        return prezzo;
    }

    /**
     * Setter per il prezzo, accetta solo double
     *
     * @param prezzo prezzo della portata
     */
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * @return l'ordinatore, quindi la posizione della portata sul menù
     */
    public OrdinatoreEnum getOrdinatore() {
        return ordinatore;
    }

    ;

    /**
     * @return il tipo della portata, quindi se è carnivora, vegetariana o di tipo pesce
     */
    public TipoEnum getTipoEnum() {
        return tipoEnum;
    }

    /**
     * @return l'id della portata, quindi la sua posizione nel database
     */
    public int getId() {
        return id;
    }

    /**
     * Setter per l'id, accetta solo numeri interi
     *
     * @param id id della portata
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Stampa classisa della portata che verrà modificata in ogni classe figlia
     */
    public void printPortata() {
        System.out.println("  " + nome + ": " + prezzo + "€");
    }


}
