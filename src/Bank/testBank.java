package Bank;

public class testBank {
    private static testBank ourInstance = new testBank();

    public static testBank getInstance() {
        return ourInstance;
    }

    private testBank() {
    }
}
