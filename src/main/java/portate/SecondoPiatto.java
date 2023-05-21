package portate;

import enumertion.OrdinatoreEnum;
import enumertion.TipoEnum;

    public class SecondoPiatto extends Portata {

        /**
         * pesoPiatto farà riferimento alla grammatura dei piatti
         */
        private Double pesoPiatto;

        public SecondoPiatto(String nome, Double prezzo, Double pesoPiatto, TipoEnum tipoEnum) {

            super(nome, prezzo, tipoEnum, OrdinatoreEnum.SECONDA_POSIZIONE);
            this.pesoPiatto = pesoPiatto;
        }

        public Double getPesoPiatto() {
            return pesoPiatto;
        }

        public void setPesoPiatto(Double pesoPiatto) {
            this.pesoPiatto = pesoPiatto;
        }

        /**
         * Override della funzione ereditata
         * dalla classe padre 'Portata'
         */
        @Override
        public void printPortata() {

            switch (getTipoEnum()) {
                case CARNIVORO -> System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                        + " \n  grammatura della carne: " + getPesoPiatto() + "g \n");
                case PESCE -> System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                        + " \n  peso del pesce: " + getPesoPiatto() + "g \n");
                case VEGETARIANO -> System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                        + " \n  grammatura del piatto: " + getPesoPiatto() + "g \n");
                default -> System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                        + " \n  peso del piatto: " + getPesoPiatto() + "g \n");
            }

        }

    }
