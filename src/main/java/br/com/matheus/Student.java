package br.com.matheus;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;

    private CPF cpf;

    private Email email;

    private List<Phone> phones = new ArrayList<>();

    public Student(String name, CPF cpf, Email email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public void addPhone(String ddd, String number) {
        this.phones.add(new Phone(ddd, number));
    }
}
