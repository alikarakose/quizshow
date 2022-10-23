package edu.pruefung.gruppe1;

import java.util.List;

public class Sendung {
    private final List<Teilnehmer> sendungsTeilnehmer;

    public Sendung(List<Teilnehmer> sendungsTeilnehmer) {
        this.sendungsTeilnehmer = sendungsTeilnehmer;
    }

    public List<Teilnehmer> getSendungsTeilnehmer() {
        return sendungsTeilnehmer;
    }
}
