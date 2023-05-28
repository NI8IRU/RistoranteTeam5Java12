package enumeration;

/**
 * Creazione: 01/05/2023
 * Enum per l'ordinatore,
 * serve per poter ordinare le portate sul menù,
 * il valore verrà assegnato a ogni classe figlia di 'Portata' nel proprio 'super'
 */

public enum OrdinatoreEnum {

    PRIMA_POSIZIONE(1),
    SECONDA_POSIZIONE(2),
    TERZA_POSIZIONE(3),
    QUARTA_POSIZIONE(4);


    /**
     * field privato e finale -
     * serve per identificare la poszione sul menù di ogni portata
     */
    private final Integer posizionePortataSulMenu;

    /**
     * Costruttore che prende come parametro un numero intero
     *
     * @param posizionePortataSulMenu definisce la posizione delle portate
     */
    OrdinatoreEnum(Integer posizionePortataSulMenu) {
        this.posizionePortataSulMenu = posizionePortataSulMenu;
    }

    /**
     * @return la posizione delle portate sul menù
     */
    public int getPosizionePortataSulMenu() {
        return posizionePortataSulMenu;
    }

}

