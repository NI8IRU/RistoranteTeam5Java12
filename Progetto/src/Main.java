import Portate.Bevande;

public class Main {
    public static void main(String[] args) {

        System.out.println("Menù\n");
        System.out.println("PRIMI PIATTI");
//Inserire portate
        System.out.println(" ");
        System.out.println("SECONDI PIATTI");
//Inserire portate
        System.out.println(" ");
        System.out.println("PIZZE");
//Inserire portate
        System.out.println(" ");
        System.out.println("DOLCI");
//Inserire portate
        System.out.println(" ");
        System.out.println("BEVANDE");
        Bevande acquaGassata = new Bevande("Acqua Gassata", 1.99);
        Bevande cocaCola = new Bevande("Coca Cola", 3.99);
        Bevande birra = new Bevande("Birra", 2.99, 4.9);
        Bevande vino = new Bevande("Vino", 10.00, 12.8);
        Bevande amaro = new Bevande("Amaro", 2.99, 20.00);
        System.out.println(
                acquaGassata + "\n"
                + cocaCola + "\n"
                + birra + "\n"
                + vino + "\n"
                + amaro
        );
        System.out.println(" ");
    }
}