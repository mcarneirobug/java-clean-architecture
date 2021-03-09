package br.com.matheus.fake;

import br.com.matheus.Phone;

public class FakePhone {

    private final static String DDD = "31";
    private final static String NUMBER = "99999-9999";

    public static Phone generate() {
        return new Phone(DDD, NUMBER);
    }
}
