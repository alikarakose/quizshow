package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ReportGesamtTest {
    Teilnehmer teilnehmer01 = new Teilnehmer("John", new Weiter(true, true, 1));
    Teilnehmer teilnehmer02 = new Teilnehmer("Beate", new Weiter(true, true, 7));
    Teilnehmer teilnehmer03 = new Teilnehmer("Horst", new Weiter(false, false, 12));
    Teilnehmer teilnehmer04 = new Teilnehmer("Ina", new Weiter(false, false, 1));
    Teilnehmer teilnehmer05 = new Teilnehmer("Marie", new Weiter(true, true, 10));

    Sendung sendung01 = new Sendung(List.of(teilnehmer01, teilnehmer02, teilnehmer03));
    Sendung sendung02 = new Sendung(List.of(teilnehmer04, teilnehmer05));

    List<Sendung> alleSendungen = List.of(sendung01, sendung02);
    GewinnMap mapGewinnStufenTest = new GewinnMap();
    ReportGesamt repGes = new ReportGesamt(alleSendungen, mapGewinnStufenTest);

    @Test
    void berechnenGesamtTest() {
        

        mapGewinnStufenTest.trageEin(1, 50);
        mapGewinnStufenTest.trageEin(7, 2000);
        mapGewinnStufenTest.trageEin(10, 16000);
        mapGewinnStufenTest.trageEin(12, 64000);
        assertThat(repGes.berechnen()).isEqualTo(82100);
    }
}