package br.com.matheus;

import br.com.matheus.fake.FakeEmail;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldCreateEmailWithValidNameAddress() {
        final var email = FakeEmail.generate();

        assertThat(email.getNameAddress(), is(equalTo("matheus@gmail.com")));
        assertNotNull(email);
    }

    @Test
    void shouldNotCreateEmailWithInvalidNameAddress() {
        final var email = FakeEmail.generate();

        final var exception = assertThrows(IllegalArgumentException.class,
                () -> email.setNameAddress(""), "Should return an IllegalArgumentException!");

        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Invalid e-mail exception!"));
    }
}
