package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class TeilnehmerTest {
    Teilnehmer teilnehmer01 = new Teilnehmer("John", new Weiter(true, false, 1));
    List<Antworten> antwortSatz001Stufe01 = List.of(
            new Antworten(1, "Gruen", "A", false),
            new Antworten(1, "Blau", "B", true),
            new Antworten(1, "Rot", "C", false),
            new Antworten(1, "Gelb", "D", false));

    @Test
    void getName() {
        assertThat(teilnehmer01.getTnName()).isEqualTo("John");
    }
}