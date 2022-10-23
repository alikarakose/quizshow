package edu.pruefung.gruppe1;

public class Antworten {

    private int stufe;
    private String antwortText;
    private String optionABCD;
    private final boolean richtigeAntwort;

    public Antworten(int stufe, String antwortText, String optionABCD, boolean richtigeAntwort) {
        /* Die Klasse ParameterCheck fuehrt die Instazierungsvalidierung durch. */
        if (new ParameterCheck().checkInstParaStufe(stufe)) {
            this.stufe = stufe;
        }
        if (new ParameterCheck().checkInstParaAntwTxt(antwortText = antwortText.trim())) {
            this.antwortText = antwortText;
        }
        if (new ParameterCheck().checkInstParaOptionABCD(optionABCD = optionABCD.toUpperCase())) {
            this.optionABCD = optionABCD;
        }
        this.richtigeAntwort = richtigeAntwort;
    }

    public String getAntwortText() {
        return antwortText;
    }

    public String getOptionABCD() {
        return optionABCD;
    }

    public int getAntwortStufe() {
        return stufe;
    }

    public boolean getRichtigeAntwort() {
        return richtigeAntwort;
    }
}
