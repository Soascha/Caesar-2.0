package src;

public class Viginere {
    private String Kt;
    private String S;
    private String Gt;

    public Viginere() {
        Gt = "";
        Kt = "";
    }

    public void verschluesseln() {

    }

    public void entschluesseln() {

    }

    private char zahlenZuBuchstaben(int pWert) {
        return (char) pWert ;
    }

    private int buchstabenZuZahlen(char pWert) {
        return (int) pWert ;
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

    public void setS (String S){
        S = s;
    }

    public int getS () {
        return S;
    }


}
