package portate;

import enumertion.OrdinatoreEnum;
import enumertion.TipoEnum;

    public class SecondoPiatto extends Portata {

        private TipoEnum tipo;

        /**
         * pesoPiatto farà riferimento alla grammatura dei piatti
         */
        private Double pesoPiatto;

        public SecondoPiatto(String nome, Double prezzo, Double pesoPiatto, TipoEnum tipo) {

            super(nome, prezzo, OrdinatoreEnum.SECONDA_POSIZIONE);
            this.pesoPiatto = pesoPiatto;
            this.tipo = tipo;
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

            switch (tipo) {
                case CARNIVORO -> System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                        + " \n  peso della carne: " + getPesoPiatto() + "g \n");
                case PESCE -> System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                        + " \n  peso del pesce: " + getPesoPiatto() + "g \n");
                case VEGETARIANO -> System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                        + " \n  grammatura dal piatto: " + getPesoPiatto() + "g \n");
            }

        }

    }
