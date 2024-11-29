public class Viginere extends Kryptomat  {

        private String S;

        public Viginere() {
            super();
            S =  "";
        }

        public void verschluesseln() {
            gt = "";
            for ( int i = 0 ; i < kt.length() ; i++) {
                int j = this.getASCII(kt.charAt(i));
                int h = this.getASCII(S.charAt(i));
                gt = gt + this.getChar(j + h);
            }
        }

        public void entschluesseln() {
            kt = "";
            for (int i = 0; i < gt.length(); i++) {
                int n = this.getASCII(gt.charAt(i));
                int m = this.getASCII(S.charAt(i));
                kt = kt + this.getChar(n - m);
            }
        }

        public void setS (String pS) {
            S =  pS;
        }

        public String getS () {
            return S;
        }
    }

