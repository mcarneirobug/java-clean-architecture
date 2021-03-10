package br.com.matheus.school.domain.student;

import br.com.matheus.school.fake.FakePhone;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void shouldCreatedPhone() {
        final var phone = FakePhone.generate();

        assertNotNull(phone);
        assertThat(phone.getDdd(), is(equalTo("31")));
        assertThat(phone.getNumber(), is(equalTo("99999-9999")));
    }

    @Test
    void shouldCreatedPhoneWithBrackets() {
        final var phone = FakePhone.generate();

        phone.setDdd("(31)");

        assertNotNull(phone);
        assertThat(phone.getDdd(), is(equalTo("(31)")));
        assertThat(phone.getNumber(), is(equalTo("99999-9999")));
    }

    @Test
    void shouldCreatedWithInvalidArguments() {
        final var phone = FakePhone.generate();

        final var exception = assertThrows(IllegalArgumentException.class,
                () -> phone.setDdd("311"), "Should return an IllegalArgumentException!");

        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Invalid DDD!"));
    }

    @Test
    void shouldCreatedWhenDDDIsNull() {
        final var phone = FakePhone.generate();

        final var exception = assertThrows(IllegalArgumentException.class,
                () -> phone.setDdd(null), "Should return an IllegalArgumentException!");

        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Invalid DDD!"));
    }

    @Test
    void shouldCreatedWhenNumberIsNull() {
        final var phone = FakePhone.generate();

        final var exception = assertThrows(IllegalArgumentException.class,
                () -> phone.setNumber(null), "Should return an IllegalArgumentException!");

        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Invalid number format!"));
    }
}
