package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReportDurchschnittTest {

    @Test
    void berechnenDurchschnittTest() {
        assertThat(new ReportDurchschnitt(5, 3).berechnen()).isEqualTo(2);
    }
}