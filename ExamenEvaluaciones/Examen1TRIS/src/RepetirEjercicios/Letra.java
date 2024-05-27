package RepetirEjercicios;

    public class Letra implements Comparable<Letra>{

        private String letra;

        private int veces;

        public Letra(char letra, int veces) {
            this.letra = String.valueOf(letra);
            this.veces = veces;
        }

        public String getLetra() {
            return letra;
        }

        public void setLetra(String letra) {
            this.letra = letra;
        }

        public int getVeces() {
            return veces;
        }

        public void setVeces(int veces) {
            this.veces = veces;
        }

        @Override
        public String toString() {
            return "Letra{" +
                    "letra='" + letra + '\'' +
                    ", veces=" + veces +
                    "}\n";
        }


        @Override
        public int compareTo(Letra o) {
            if (this.veces > o.veces){
                return -1;
            } else if (this.veces < o.veces) {
                return 1;
            }else {
                return 0;
            }
        }
    }
