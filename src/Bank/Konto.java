package Bank;

import java.util.ArrayList;

public abstract class Konto{

    private int kontostand;
    private int kontonummer;
    private ArrayList<Auszugseintrag> log = new ArrayList<Auszugseintrag>();

    public int getKontostand() {
        return kontostand;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public abstract void abheben(int betrag);

    public void einzahlen(int betrag) {

        kontostand = kontostand + betrag;
    }

    public abstract String auszugsdatenErstellen();


}
