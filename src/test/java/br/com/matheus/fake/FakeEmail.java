package br.com.matheus.fake;

import br.com.matheus.Email;

public class FakeEmail {

    private final static String NAME_ADDRESS = "matheus@gmail.com";

    public static Email generate() {
        return new Email(NAME_ADDRESS);
    }
}
