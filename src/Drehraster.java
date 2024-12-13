public class Drehraster extends Kryptomat{

    private int S;

    private char [][] zDrehraster;


    public Drehraster(){
        super();
        this.zDrehraster = new char [S][kt.length()/S];
    }

    public void verschluesseln() {
        int i = 0;
        for (int y = 0; y < kt.length() / S; y++) {

                for (int x = 0; x < S; x++) {
                    zDrehraster[y][x] = kt.charAt(i);
                    i++;
                }
            }
    }

    public void setS (int pS) {

    }

    public String getS () {
        return S;
    }
}













}
