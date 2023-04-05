public class Ristorante {
    private String nome;
    private String tipo;

    public Ristorante(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public static void printMenu() {
        System.out.println("MENÙ\n");
        System.out.println("PRIMI PIATTI\n");

        System.out.println("SECONDI PIATTI\n");

        System.out.println("PIZZE\n");

        System.out.println("DOLCI\n");

        System.out.println("BEVANDE\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
