package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FragenTest {

    Teilnehmer teilnehmer01 = new Teilnehmer("John", new Weiter(true, false, 1));
    List<Antworten> antwortSatz001Stufe01 = List.of(
            new Antworten(1, "Gruen", "A", false),
            new Antworten(1, "Blau", "B", true),
            new Antworten(1, "Rot", "C", false),
            new Antworten(1, "Gelb", "D", false));
    Fragen frage001Stufe01 = new Fragen(false, 1, "Welche Farbe gibt es in einer Ampel nicht?", antwortSatz001Stufe01);

    @Test
    void checkStufeFragenTNTest() {
        assertThat(frage001Stufe01.getFrageStufe()).isEqualTo(teilnehmer01.weiter.getAktuelleStufe());
    }
}