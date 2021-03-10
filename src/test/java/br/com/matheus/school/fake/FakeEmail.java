package br.com.matheus.school.fake;

import br.com.matheus.school.domain.student.Email;

public class FakeEmail {

    private final static String NAME_ADDRESS = "matheus@gmail.com";

    public static Email generate() {
        return new Email(NAME_ADDRESS);
    }
}
