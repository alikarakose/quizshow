package edu.pruefung.gruppe1;

import java.util.List;

public class QuizShow {
    public static void main(String[] args) {

        GewinnMap mapGewinnStufen = new GewinnMap();
        mapGewinnStufen.trageEin(0,0);
        mapGewinnStufen.trageEin(1,50);
        mapGewinnStufen.trageEin(2,100);
        mapGewinnStufen.trageEin(3,200);
        mapGewinnStufen.trageEin(4,300);
        mapGewinnStufen.trageEin(5,500);
        mapGewinnStufen.trageEin(6,1000);
        mapGewinnStufen.trageEin(7,2000);
        mapGewinnStufen.trageEin(8,4000);
        mapGewinnStufen.trageEin(9,8000);
        mapGewinnStufen.trageEin(10,16000);
        mapGewinnStufen.trageEin(11,32000);
        mapGewinnStufen.trageEin(12,64000);
        mapGewinnStufen.trageEin(13,125000);
        mapGewinnStufen.trageEin(14,500000);
        mapGewinnStufen.trageEin(15,1000000);

        Teilnehmer teilnehmer01 = new Teilnehmer("Dr. John-Doe", new Weiter(true, false, 1));
        Teilnehmer teilnehmer02 = new Teilnehmer("Beate", new Weiter(true, false, 7));
        Teilnehmer teilnehmer03 = new Teilnehmer("Horst", new Weiter(true, false, 12));
        Teilnehmer teilnehmer04 = new Teilnehmer("Ina", new Weiter(true, false, 1));
        Teilnehmer teilnehmer05 = new Teilnehmer("Marie", new Weiter(true, false, 10));
        Teilnehmer teilnehmer06 = new Teilnehmer("Uwe", new Weiter(true, false, 15));
        Teilnehmer teilnehmer07 = new Teilnehmer("Heinz", new Weiter(true, false, 15));
        Teilnehmer teilnehmer08 = new Teilnehmer("Gisela", new Weiter(true, false, 4));
        Teilnehmer teilnehmer09 = new Teilnehmer("Martin", new Weiter(true, false, 13));
        Teilnehmer teilnehmer10 = new Teilnehmer("Elfi", new Weiter(true, false, 8));

        Sendung sendung01 = new Sendung(List.of(teilnehmer01,teilnehmer02,teilnehmer03));
        Sendung sendung02 = new Sendung(List.of(teilnehmer04,teilnehmer05));
        Sendung sendung03 = new Sendung(List.of(teilnehmer06,teilnehmer07,teilnehmer08));
        Sendung sendung04 = new Sendung(List.of(teilnehmer09,teilnehmer10));

        List<Sendung> alleSendungen = List.of(sendung01,sendung02,sendung03,sendung04);

        List<Antworten> antwortSatz001Stufe01 = List.of(
                new Antworten(1, "Gruen", "a", false),
                new Antworten(1, "Blau", "B", true),
                new Antworten(1, "Rot", "C", false),
                new Antworten(1, "Gelb", "D", false));
        List<Antworten> antwortSatz002Stufe02 = List.of(
                new Antworten(2, "Baerentatze", "A", false),
                new Antworten(2, "Baerenzunge", "B", false),
                new Antworten(2, "Baerenklau", "C", true),
                new Antworten(2, "Baerenkopf", "D", false));
        List<Antworten> antwortSatz003Stufe03 = List.of(
                new Antworten(3, "Antwort A 3.3", "A", true),
                new Antworten(3, "Antwort B 3.3", "B", false),
                new Antworten(3, "Antwort C 3.3", "C", false),
                new Antworten(3, "Antwort D 3.3", "D", false));
        List<Antworten> antwortSatz010Stufe10 = List.of(
                new Antworten(10, "Antwort A 10.10", "A", false),
                new Antworten(10, "Antwort B 10.10", "B", true),
                new Antworten(10, "Antwort C 10.10", "C", false),
                new Antworten(10, "Antwort D 10.10", "D", false));
        List<Antworten> antwortSatz012Stufe12 = List.of(
                new Antworten(12, "Antwort A 12.12", "A", false),
                new Antworten(12, "Antwort B 12.12", "B", false),
                new Antworten(12, "Antwort C 12.12", "C", false),
                new Antworten(12, "Antwort D 12.12", "D", true));
        List<Antworten> antwortSatz015Stufe15 = List.of(
                new Antworten(15, "Antwort A 15.15", "A", false),
                new Antworten(15, "Antwort B 15.15", "B", false),
                new Antworten(15, "Antwort C 15.15", "C", false),
                new Antworten(15, "Antwort D 15.15", "D", true));

        List<Antworten> antwortSatz016Stufe01 = List.of(
                new Antworten(1, "Antwort A 16.1", "A", false),
                new Antworten(1, "Antwort B 16.1", "B", true),
                new Antworten(1, "Antwort C 16.1", "C", false),
                new Antworten(1, "Antwort D 16.1", "D", false));
        List<Antworten> antwortSatz030Stufe15 = List.of(
                new Antworten(15, "Antwort A 30.15", "A", false),
                new Antworten(15, "Antwort B 30.15", "B", false),
                new Antworten(15, "Antwort C 30.15", "C", false),
                new Antworten(15, "Antwort D 30.15", "D", true));

        Fragen frage001Stufe01 = new Fragen(false, 1, "Welche Farbe gibt es in einer Ampel nicht?", antwortSatz001Stufe01);
        Fragen frage002Stufe02 = new Fragen(false, 2, "Was ist kein Teil eines Tieres?", antwortSatz002Stufe02);
        Fragen frage003Stufe03 = new Fragen(false, 3, "Was ist 3.3?", antwortSatz003Stufe03);
        Fragen frage010Stufe10 = new Fragen(false, 10, "Was ist 10.10?", antwortSatz010Stufe10);
        Fragen frage012Stufe12 = new Fragen(false, 12, "Was ist 12.12?", antwortSatz012Stufe12);
        Fragen frage015Stufe15 = new Fragen(false, 15, "Was ist 15.15?", antwortSatz015Stufe15);

        Fragen frage016Stufe01 = new Fragen(false, 1, "Was ist 16.1?", antwortSatz016Stufe01);
        Fragen frage030Stufe15 = new Fragen(false, 15, "Was ist 30.15?", antwortSatz030Stufe15);

        System.err.println("|>|===== Ablauf der Spiellogik =====");

        warten();System.out.print("01: ");System.out.println(teilnehmer01.getTnName() + " spielt um Stufe: " + teilnehmer01.weiter.getAktuelleStufe());
        warten();System.out.print("02: ");teilnehmer01.tnFrageStellen(frage001Stufe01);
        warten();System.out.print("03: ");teilnehmer01.antwortChecken("b");
        warten();System.out.print("04: ");teilnehmer01.tnFrageStellen(frage001Stufe01);
        warten();System.out.print("05: ");System.out.println(teilnehmer01.getTnName() + " spielt um Stufe: " + teilnehmer01.weiter.getAktuelleStufe());
        warten();System.out.print("06: ");teilnehmer01.tnFrageStellen(frage002Stufe02);
        warten();System.out.print("07: ");teilnehmer01.antwortChecken("A");
        warten();System.out.print("08: ");System.out.println(teilnehmer01.getTnName() + " ist fertig und bleibt in Stufe: " + teilnehmer01.weiter.getAktuelleStufe());
        warten();System.out.print("09: ");teilnehmer01.tnFrageStellen(frage003Stufe03);
        warten();System.out.print("10: ");System.out.println(teilnehmer04.getTnName() + " eine bereits gestellte Frage stellen");
        warten();System.out.print("11: ");teilnehmer04.tnFrageStellen(frage001Stufe01);
        warten();System.out.print("12: ");System.out.println(teilnehmer02.getTnName() + " spielt um Stufe: " + teilnehmer02.weiter.getAktuelleStufe());
        warten();System.out.print("13: ");teilnehmer02.weiter.setStop(true);System.out.println(teilnehmer02.getTnName() + " hoert auf!");
        warten();System.out.print("14: ");System.out.println(teilnehmer02.getTnName() + " ist fertig und bleibt in Stufe: " + teilnehmer02.weiter.getAktuelleStufe());
        warten();System.out.print("15: ");teilnehmer03.tnFrageStellen(frage016Stufe01);
        warten();System.out.print("16: ");teilnehmer03.antwortChecken("A");
        warten();System.out.print("19: ");System.out.println(teilnehmer03.getTnName() + " spielt um Stufe: " + teilnehmer03.weiter.getAktuelleStufe());
        warten();System.out.print("20: ");teilnehmer03.tnFrageStellen(frage012Stufe12);
        warten();System.out.print("21: ");teilnehmer03.antwortChecken("A");
        warten();System.out.print("22: ");System.out.println(teilnehmer03.getTnName() + " ist fertig und bleibt in Stufe: " + teilnehmer03.weiter.getAktuelleStufe());
        warten();System.out.print("23: ");System.out.println(teilnehmer05.getTnName() + " spielt um Stufe: " + teilnehmer05.weiter.getAktuelleStufe());
        warten();System.out.print("24: ");teilnehmer05.tnFrageStellen(frage010Stufe10);
        warten();System.out.print("25: ");teilnehmer05.antwortChecken("D");
        warten();System.out.print("26: ");System.out.println(teilnehmer05.getTnName() + " ist fertig und bleibt in Stufe: " + teilnehmer05.weiter.getAktuelleStufe());
        warten();System.out.print("27: ");System.out.println(teilnehmer06.getTnName() + " spielt um Stufe: " + teilnehmer06.weiter.getAktuelleStufe());
        warten();System.out.print("28: ");teilnehmer06.tnFrageStellen(frage015Stufe15);
        warten();System.out.print("29: ");teilnehmer06.antwortChecken("A");
        warten();System.out.print("30: ");System.out.println(teilnehmer06.getTnName() + " ist fertig und bleibt in Stufe: " + teilnehmer06.weiter.getAktuelleStufe());
        warten();System.out.print("31: ");System.out.println(teilnehmer07.getTnName() + " spielt um Stufe: " + teilnehmer07.weiter.getAktuelleStufe());
        warten();System.out.print("32: ");teilnehmer07.tnFrageStellen(frage030Stufe15);
        warten();System.out.print("33: ");teilnehmer07.antwortChecken("D");
        warten();System.out.print("34: ");System.out.println(teilnehmer07.getTnName() + " ist fertig und bleibt in Stufe: " + teilnehmer07.weiter.getAktuelleStufe());

        System.err.println("===== Ende Ablauf der Spiellogik =====|<|");

        System.err.println("\n|>|===== Anfang Gewinnreporte =====");
        warten();System.out.printf(teilnehmer01.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer01, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer02.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer02, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer03.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer03, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer04.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer04, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer05.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer05, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer06.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer06, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer07.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer07, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer08.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer08, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer09.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer09, mapGewinnStufen).berechnen());
        warten();System.out.printf(teilnehmer10.getTnName() + " hat %d EUR gewonnen.\n", new ReportEinzel(teilnehmer10, mapGewinnStufen).berechnen());

        warten();System.out.printf("Die Gesamtsumme aller %d Sendungen betraegt: %d EUR.\n",alleSendungen.size(), new ReportGesamt(alleSendungen, mapGewinnStufen).berechnen());

        warten();System.out.printf("Die auf den vollen Euro gerundete Gewinnsumme je Sendung betraegt im Durchschnitt: %d EUR.\n", new ReportDurchschnitt(new ReportGesamt(alleSendungen, mapGewinnStufen).berechnen(),alleSendungen.size()).berechnen());

        System.err.println("===== Ende Gewinnreporte =====|<|");
    }
    /* Workaround, da ohne Verzoegerung die Reihenfolge der Konsolenausgaben fehlerhaft ist! */
    public static void warten() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
