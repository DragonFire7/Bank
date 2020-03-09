package Bank;

public abstract class Konto{

    private int kontostand;
    private int kontonummer;


    public int getKontostand() {
        return kontostand;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void abheben(int betrag) {
        kontostand = kontostand + betrag;
    }

    abstract void einzahlen(int betrag);
}
