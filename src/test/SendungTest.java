package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SendungTest {
    Teilnehmer teilnehmer01 = new Teilnehmer("John", new Weiter(true, false, 1));
    Teilnehmer teilnehmer02 = new Teilnehmer("Beate", new Weiter(true, false, 7));
    Teilnehmer teilnehmer03 = new Teilnehmer("Horst", new Weiter(true, false, 12));
    Sendung sendung01 = new Sendung(List.of(teilnehmer01, teilnehmer02, teilnehmer03));

    @Test
    void listSendungTest() {
        assertThat(sendung01.getSendungsTeilnehmer().contains(teilnehmer03)).isTrue();
    }
}