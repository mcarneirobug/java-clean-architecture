package br.com.matheus.school.domain.student;

import br.com.matheus.school.fake.FakeCPF;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void shouldCreatedAnCPF() {
        final var cpf = FakeCPF.generate();

        assertNotNull(cpf);
        assertThat(cpf.getNumber(), is(equalTo("011.336.808-11")));
    }

    @ParameterizedTest
    @ValueSource(strings = {"011.336.808-111", "01133680811"})
    void shouldCreateCpfWithInvalidNumberThenAnIllegalArgumentExceptionThrow(String number) {
        final var cpf = FakeCPF.generate();

        final var exception = assertThrows(IllegalArgumentException.class,
                () -> cpf.setNumber(number), "Should return an IllegalArgumentException");

        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Invalid CPF!"));
    }

    @Test
    void shouldCreateWithNullCpfThenAnIllegalArgumentExceptionThrow() {
        final var cpf = FakeCPF.generate();

        final var exception = assertThrows(IllegalArgumentException.class,
                () -> cpf.setNumber(null), "Should return an IllegalArgumentException");

        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Invalid CPF!"));
    }
}
