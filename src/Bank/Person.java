package Bank;

public abstract class Person {

    private String name;
    private int pin;

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
