package br.com.matheus.school.fake;

import br.com.matheus.school.domain.student.Phone;

public class FakePhone {

    private final static String DDD = "31";
    private final static String NUMBER = "99999-9999";

    public static Phone generate() {
        return new Phone(DDD, NUMBER);
    }
}
