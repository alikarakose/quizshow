package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReportEinzelTest {
    GewinnMap mapGewinnStufenTest = new GewinnMap();

    @Test
    void berechnenEinzelTest() {
        Teilnehmer teilnehmer1 = new Teilnehmer("Dr. John-Doe", new Weiter(true, true, 5));
        mapGewinnStufenTest.trageEin(0, 0);
        mapGewinnStufenTest.trageEin(1, 50);
        mapGewinnStufenTest.trageEin(2, 100);
        mapGewinnStufenTest.trageEin(3, 200);
        mapGewinnStufenTest.trageEin(4, 300);
        mapGewinnStufenTest.trageEin(5, 500);
        mapGewinnStufenTest.trageEin(6, 1000);
        assertThat(new ReportEinzel(teilnehmer1, mapGewinnStufenTest).berechnen()).isEqualTo(500);
    }
}