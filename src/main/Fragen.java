package edu.pruefung.gruppe1;

import java.util.List;

public class Fragen {

    private boolean frageBenutzt;
    private int stufe;
    private String frageText;
    List<Antworten> antwortSatz;

    public Fragen(boolean frageBenutzt, int stufe, String frageText, List<Antworten> antwortSatz) {
        /* Die Klasse ParameterCheck fuehrt die Instazierungsvalidierung durch. */
        if (new ParameterCheck().checkInstParaStufe(stufe)) {
            this.stufe = stufe;
        }
        if (new ParameterCheck().checkInstParaFrageTxt(frageText = frageText.trim())) {
            this.frageText = frageText;
        }
        if (new ParameterCheck().checkInstParaAntwList(antwortSatz)) {
            this.antwortSatz = antwortSatz;
        }
        this.frageBenutzt = frageBenutzt; // koennte man auch direkt auf false setzen
    }

    public void setFrageBenutzt(boolean frageBenutzt) {
        this.frageBenutzt = frageBenutzt;
    }

    public int getFrageStufe() {
        return stufe;
    }

    public String getFrageText() {
        return frageText;
    }

    public boolean getFrageBenutzt() {
        return frageBenutzt;
    }

    public List<Antworten> getAntwortSatz() {
        return antwortSatz;
    }

    public void frageStellen(Fragen aktuelleFrage, int tnAktuelleStufe) {
        if (checkStufeFrageTN(tnAktuelleStufe)) {
            if (!aktuelleFrage.getFrageBenutzt()) {
                aktuelleFrage.setFrageBenutzt(true);
                System.out.println(aktuelleFrage.getFrageText());
                for (var a : aktuelleFrage.getAntwortSatz()) {
                    System.out.println(a.getOptionABCD() + ": " + a.getAntwortText());
                }
            } else {
                System.err.println("Frage wurde bereits gestellt!");
            }
        } else {
            System.err.println("Stufe(" + getFrageStufe() + ") der Frage entspricht nicht Stufe(" + tnAktuelleStufe + ") des Spielers!");
        }
    }

    public boolean checkStufeFrageTN(int tnAktuelleStufe) {
        return tnAktuelleStufe == getFrageStufe();
    }
}
