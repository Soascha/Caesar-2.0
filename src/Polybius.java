public class Polybius extends Kryptomat {

        private int[][] alphabetQuadrat;

        public Polybius() {
                super();
                this.alphabetQuadrat = new int [6][6];
        }

        private void bfmS() {

                int ASCII = 65;

                for (int i = 1 ; i < 6 ; i++)

                {
                        for (int j  = 1 ; j < 6 ; j++)

                        {
                                alphabetQuadrat[i][j] = ASCII;

                                if(ASCII == 73)

                                {
                                        ASCII = ASCII+2;
                                }

                        }
                }
        }

        public void verschluesseln() {

        }

        public void entschluesseln(){

        }

}
