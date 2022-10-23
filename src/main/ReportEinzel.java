package edu.pruefung.gruppe1;

public class ReportEinzel implements Berechnung {
    Teilnehmer teilnehmer;
    GewinnMap mapGewinnStufen;

    public ReportEinzel(Teilnehmer teilnehmer, GewinnMap mapGewinnStufen) {
        this.teilnehmer = teilnehmer;
        this.mapGewinnStufen = mapGewinnStufen;
    }

    @Override
    public int berechnen() {
        if (!teilnehmer.weiter.getRichtig() || teilnehmer.weiter.getStop()) {
            return mapGewinnStufen.mapGewinnStufen.get(teilnehmer.weiter.getAktuelleStufe());
        } else {
            System.err.println(teilnehmer.getTnName() + " hat das Spiel noch nicht begonnen oder ist gerade am spielen!");
            return 0;
        }
    }
}