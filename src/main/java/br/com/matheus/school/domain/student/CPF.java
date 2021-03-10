package br.com.matheus.school.domain.student;

public class CPF {

    private String number;

    public CPF(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        if(number == null || !number.matches("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)")) {
            throw new IllegalArgumentException("Invalid CPF!");
        }
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }
}
