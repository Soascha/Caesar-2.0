public class Drehraster extends Kryptomat{

    private int S;

    private char [][] zDrehraster;


    public Drehraster(){
        super();
        this.zDrehraster = new char [S][kt.length()/S];
    }

    public void verschluesseln() {

        for (int i = 0; i < kt.length(); i++) {

            for (int y = 0; y < kt.length() / S; y++) {

                for (int x = 0; x < S; x++) {

                    zDrehraster[y][x] = kt.charAt(i);

                }
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
