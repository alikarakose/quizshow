package edu.pruefung.gruppe1;

public class Weiter {
    private boolean richtig;
    private boolean stop;
    private int aktuelleStufe;

    public Weiter(boolean richtig, boolean stop, int aktuelleStufe) {
        /* Die Klasse ParameterCheck fuehrt die Instazierungsvalidierung durch. */
        /* Damit in der QuizShow Teilnehmer mit unterschiedlichen Stufen instanziert werden koennen, ist hier 1-15 erlaubt, ansonsten wuerde stufe 1 vorgegeben werden. */
        if (new ParameterCheck().checkInstParaStufe(aktuelleStufe)) {
            this.aktuelleStufe = aktuelleStufe;
        }
        /*  Damit in der QuizShow Teilnehmer mit unterschiedlichen Status instanziert werden koennen, ist hier die TRUE/FALSE Zuweisung nicht fest vorgegeben */
        this.richtig = richtig;
        this.stop = stop;
    }

    public boolean getRichtig() { // Teilnehmer hat Frage richtig beantwortet
        return richtig;
    }

    public boolean getStop() { // Teilnehmer hat abgebrochen
        return stop;
    }

    public int getAktuelleStufe() {
        return aktuelleStufe;
    }

    public void setRichtig(boolean richtig) {
        this.richtig = richtig;
    }

    public void setStop(boolean stop) {
        if (getAktuelleStufe() != 15) {
            setAktuelleStufe(getAktuelleStufe() - 1);
        }
        this.stop = stop;
    }

    public void setAktuelleStufe(int aktuelleStufe) {
        this.aktuelleStufe = aktuelleStufe;
    }
}
