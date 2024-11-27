public class Caesar extends Kryptomat {


    private int S;


    public Caesar() {
       super();
       S = 0;
    }

    public void verschluesseln() {
        gt = "";
        for (int i = 0; i < kt.length(); i++) {
            int h = this.getASCII(kt.charAt(i));
            gt = gt + this.getChar(h + S);
        }
    }

    public void entschluesseln() {
        kt = "";
        for (int i = 0; i < gt.length(); i++) {
            int k = this.getASCII(gt.charAt(i));
            kt = kt + this.getChar(k - S);
        }
    }

    public void setS(int s) {
        S = s;
    }
    public int getS() {
        return S;
    }
}
