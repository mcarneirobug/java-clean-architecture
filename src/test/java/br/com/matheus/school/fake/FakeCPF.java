package br.com.matheus.school.fake;

import br.com.matheus.school.domain.student.CPF;

public class FakeCPF {

    private final static String NUMBER = "011.336.808-11";

    public static CPF generate() {
        return new CPF(NUMBER);
    }
}
