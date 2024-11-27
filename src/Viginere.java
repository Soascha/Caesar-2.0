public class Viginere extends Kryptomat  {
        private String Kt;

        private String S;

        private String Gt;

        public Viginere() {
            Gt = "";
            Kt = "";
            S = "";
        }

        public void verschluesseln() {
            for ( int i = 0 ; i < Kt.length() ; i++) {
                int j = this.getASCII(Kt.charAt(i));
                int h = this.getASCII(S.charAt(i));
                Gt = Gt + this.getChar(j + h);
            }
        }

        public void entschluesseln() {
            for (int i = 0; i < Gt.length(); i++) {
                int n = this.getASCII(Gt.charAt(i));
                int m = this.getASCII(S.charAt(i));
                Kt = Kt + this.getChar(n - m);
            }
        }

        public void setS (String pS) {
            S =  pS;
        }

        public String getS () {
            return S;
        }
    }

