package br.com.matheus.school.domain.student;

public class Email {

    private String nameAddress;

    public Email(String nameAddress) {
        this.setNameAddress(nameAddress);
    }

    public void setNameAddress(String nameAddress) {
        if(nameAddress == null ||
                !nameAddress.matches("^([a-zA-Z0-9_\\-.]+)@([a-zA-Z0-9_\\-]+)\\.([a-zA-Z]{2,})$")) {
            throw new IllegalArgumentException("Invalid e-mail exception!");
        }
        this.nameAddress = nameAddress;
    }

    public String getNameAddress() {
        return this.nameAddress;
    }
}
