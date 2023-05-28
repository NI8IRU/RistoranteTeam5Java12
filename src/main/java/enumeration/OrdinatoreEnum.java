package enumeration;

public enum OrdinatoreEnum {

    PRIMA_POSIZIONE(1),
    SECONDA_POSIZIONE(2),
    TERZA_POSIZIONE(3),
    QUARTA_POSIZIONE(4);



    private final Integer posizionePortataSulMenu;

    OrdinatoreEnum(Integer posizionePortataSulMenu) {
        this.posizionePortataSulMenu = posizionePortataSulMenu;
    }


    public int getPosizionePortataSulMenu() {
        return posizionePortataSulMenu;
    }

}
