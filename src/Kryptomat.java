public abstract class Kryptomat {
    protected String gt;
    protected String kt;

    public Kryptomat(){
        gt ="";
        kt="";
    }

    protected abstract void verschluesseln();

    protected abstract void entschluesseln();

    protected char getChar(int pWert){
        return (char) pWert;
    }
    protected int getASCII(char pWert){
        return pWert;
    }
    public String getGt(){
        return gt;
    }
    public void setGt(String pGt){
        gt=pGt;
    }
    public String getKt(){
        return kt;
    }
    public void setKt(String pKt){
        kt=pKt;
    }
}