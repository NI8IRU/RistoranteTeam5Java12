import java.util.List;

public class Ristorante {
    private String nome;
    private String stelleRistorante;
    private Indirizzo indirizzo;

    private List<Menu> menus;

    public Ristorante(String nome, String stelleRistorante, Indirizzo indirizzo, List<Menu> menus) {
        this.nome = nome;
        this.stelleRistorante = stelleRistorante;
        this.indirizzo = indirizzo;
        this.menus = menus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStelleRistorante() {
        return stelleRistorante;
    }

    public void setStelleRistorante(String stelleRistorante) {
        this.stelleRistorante = stelleRistorante;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
    public void addMenu(Menu menu){
        this.menus.add(menu);
    }
    public void removeMenu(Menu menu){
        this.menus.remove(menu);
    }
}
