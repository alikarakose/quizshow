package edu.pruefung.gruppe1;

public class Teilnehmer {

    private String name;
    Weiter weiter;
    Fragen frage;

    public Teilnehmer(String name, Weiter weiter) {
        /* Die Klasse ParameterCheck fuehrt die Instazierungsvalidierung durch. */
        if (new ParameterCheck().checkInstParaName(name = name.trim())) {
            this.name = name;
        }
        this.weiter = weiter;
    }

    public String getTnName() {
        return name;
    }

    public void tnFrageStellen(Fragen tnAktuelleFrage) {
        if (weiter.getRichtig() && !weiter.getStop()) { //Checken ob der Teilnehmer noch weiterspielen darf
            this.frage = tnAktuelleFrage;
            frage.frageStellen(tnAktuelleFrage, weiter.getAktuelleStufe());
        } else {
            System.err.println(getTnName() + " darf nicht mehr weiterspielen!");
        }
    }

    public void antwortChecken(String tnAntwort) {
        if (frage.checkStufeFrageTN(weiter.getAktuelleStufe())) {
            tnAntwort = tnAntwort.toUpperCase();
            String richtigeOptionABCD = "";
            for (var a : frage.getAntwortSatz()) { // Richtige Antwort holen
                if (a.getRichtigeAntwort()) {
                    richtigeOptionABCD = a.getOptionABCD();
                }
            }
            if (richtigeOptionABCD.equals(tnAntwort)) { // Antwort vom Teilnehmer mit der korrekten Antwort vergleichen
                if (weiter.getAktuelleStufe() == 15) {
                    weiter.setStop(true);
                    System.out.println(getTnName() + ", Deine Antwort \"" + tnAntwort + "\" ist richtig! Du gewinnst 1 Million Euro!");
                } else {
                    weiter.setAktuelleStufe(weiter.getAktuelleStufe() + 1);
                    System.out.println(getTnName() + ", Deine Antwort \"" + tnAntwort + "\" ist richtig!");
                }

            } else { //
                weiter.setRichtig(false);
                weiter.setAktuelleStufe(weiter.getAktuelleStufe() - 1);

                int aktuelleStufeTN = weiter.getAktuelleStufe();
                if (aktuelleStufeTN < 5) {
                    weiter.setAktuelleStufe(0);
                } else if (aktuelleStufeTN > 5 && aktuelleStufeTN < 10) {
                    weiter.setAktuelleStufe(5);
                } else if (aktuelleStufeTN > 10) {
                    weiter.setAktuelleStufe(10);
                }
                System.err.println(getTnName() + ", Deine Antwort \"" + tnAntwort + "\" ist leider falsch!");
            }
        } else {
            System.err.println("Die Antwort wird nicht ausgewertet, da die Stufe(" + frage.getFrageStufe() + ") der Frage nicht der Stufe(" + weiter.getAktuelleStufe() + ") des Spielers entspricht!");
        }
    }
}
