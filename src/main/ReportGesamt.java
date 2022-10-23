package edu.pruefung.gruppe1;

import java.util.List;

public class ReportGesamt implements Berechnung {
    List<Sendung> alleSendungen;
    GewinnMap mapGewinnStufen;

    public ReportGesamt(List<Sendung> alleSendungen, GewinnMap mapGewinnStufen) {
        this.alleSendungen = alleSendungen;
        this.mapGewinnStufen = mapGewinnStufen;
    }

    @Override
    public int berechnen() {
        int gesamtSumme = 0;
        for (Sendung sendung : alleSendungen) {
            List<Teilnehmer> teilnehmerListe = sendung.getSendungsTeilnehmer();
            for (Teilnehmer teilnehmer : teilnehmerListe) {
                if (!teilnehmer.weiter.getRichtig() || teilnehmer.weiter.getStop()) {
                    gesamtSumme += mapGewinnStufen.mapGewinnStufen.get(teilnehmer.weiter.getAktuelleStufe());
                }
            }
        }
        return gesamtSumme;
    }
}
