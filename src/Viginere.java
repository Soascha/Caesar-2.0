package src;

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
        public int getASCII (char pWert) {
            return  pWert;
        }
        public char getChar(int pWert) {
            return (char) pWert;
        }

        public void setGt(String pGt) {
            Gt = pGt;
        }

        public String getGt() {
            return Gt;
        }
        public void setKt (String pKt){
            Kt = pKt;
        }

        public String getKt() {
            return Kt;
        }

        public void setS (String pS) {
            S =  pS;
        }

        public String getS () {
            return S;
        }
    }

