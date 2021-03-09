package br.com.matheus;

public class Phone {

    private String ddd;
    private String number;

    public Phone(String ddd, String number) {
        this.setDdd(ddd);
        this.setNumber(number);
    }

    // format -> (xx) xxxxx-xxxx

    public void setDdd(String ddd) {
        if (ddd == null || !ddd.matches("^\\(?[1-9]{2}\\)?")) {
            throw new IllegalArgumentException("Invalid DDD!");
        }
        this.ddd = ddd;
    }

    public void setNumber(String number) {
        if (number == null || !number.matches(" ?(?:[2-8]|9[1-9])[0-9]{3}-?[0-9]{4}$")) {
            throw new IllegalArgumentException("Invalid number format!");
        }
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }
}
