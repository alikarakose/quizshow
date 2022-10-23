package edu.pruefung.gruppe1;

public class ReportDurchschnitt implements Berechnung {
    private final int gesamtSumme;
    private final int anzahlSendungen;

    public ReportDurchschnitt(int gesamtSumme, int anzahlSendungen) {
        this.gesamtSumme = gesamtSumme;
        this.anzahlSendungen = anzahlSendungen;
    }

    @Override
    public int berechnen() {
        return (gesamtSumme + anzahlSendungen - 1) / anzahlSendungen;
    }
}
