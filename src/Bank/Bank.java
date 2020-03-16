package Bank;

public class Bank {

    static private Bank b;
   //Bei mir gehts
    private Bank()
    {

    }

    public static Bank bankGeben()
    {
        Bank bank1 = new Bank();
        return bank1;
    }


}
