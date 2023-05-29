package ristorante;

/**
 * La classe Indirizzo rappresenta un indirizzo di un ristorante.
 */
public record Indirizzo(String via, String provincia, int numCivico, int cap, String city, String infoAggiuntive) {

    /**
     * Stampa l'indirizzo formattato.
     */
    public void printIndirizzo() {
        System.out.println(via + " " + numCivico + ", " + city + "\n" +
                provincia + ", " +  cap + "\n" +
                infoAggiuntive);
    }
}
