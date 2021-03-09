package br.com.matheus;

public class FactoryStudent {

    private Student student;

    public FactoryStudent withNameAndCpfAndEmail(String name, String cpf, String email) {
        this.student = new Student(name, new CPF(cpf), new Email(email));
        return this;
    }

    public FactoryStudent withPhone(String ddd, String number) {
        if (student != null) {
            this.student.addPhone(ddd, number);
        }
        return this;
    }

    public Student create() {
        return this.student;
    }
}
