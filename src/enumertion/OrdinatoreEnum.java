package enumertion;

//creato un enum per l'ordinatore,
// così da poter ordinare le portate sul menù
public enum OrdinatoreEnum {

    PRIMA_POSIZIONE(1),
    SECONDA_POSIZIONE(2),
    TERZA_POSIZIONE(3),
    QUARTA_POSIZIONE(4);

    //field privato e finale
    /**
     *
     */
    //TODO utilizzare l'integer, quindi sempre oggetti
    private final int posizionePortataSulMenu;

    //messo il field di prima dentro il costruttore
    OrdinatoreEnum(int posizionePortataSulMenu) {
        this.posizionePortataSulMenu = posizionePortataSulMenu;
    }

    //getter pubblico così che lo si può usare in tutte le classi
    public int getPosizionePortataSulMenu() {
        return posizionePortataSulMenu;
    }

}
