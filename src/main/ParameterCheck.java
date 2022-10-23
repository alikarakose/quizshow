package edu.pruefung.gruppe1;

import java.util.List;

public class ParameterCheck {

    /* Parameter bei Instanzierung ueberpruefen */
    public boolean checkInstParaStufe(int stufe) {
        if (stufe < 1 || stufe > 15) {
            throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n stufe muss eine ganze zahl zwischen 1 und 15 sein, ist aber: " + stufe + " !\n");
        }
        return true;
    }

    public boolean checkInstParaOptionABCD(String optionABCD) {
        if (!optionABCD.matches("[ABCD]")) {
            throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n optionABCD muss A, B, C oder D sein, ist aber: " + optionABCD + " !\n");
        }
        return true;
    }

    public boolean checkInstParaAntwTxt(String antwortText) {
        if (antwortText.equals("")) {
            throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n antwortText darf nicht leer sein oder nur aus Leerzeichen bestehen!\n");
        }
        return true;
    }

    public boolean checkInstParaName(String text) {
        if (text.length() < 2 || !text.matches("([A-Za-zßÄäÖöÜü \\u00c4\\u00e4\\u00d6\\u00f6\\u00dc\\u00fc\\u00df\\-\\.\\'])*")) {
            // utf-8 Problematik bei der Ausgabe wird leider auch nicht mit System.setOut(new PrintStream(System.out, true, "UTF-8")); (inkl. der passenden imports) abgefangen !
            throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n name darf nicht leer sein, nur aus Leerzeichen oder anderen Zeichen als A-Z a-z Umlaute sz -.' bestehen, ist aber: " + text + "\n");
        }
        return true;
    }

    public boolean checkInstParaFrageTxt(String frageText) {
        String[] textarray = frageText.split(" ");
        int woerter = textarray.length;
        String letztesZeichen = String.valueOf(frageText.charAt(frageText.length() - 1));
        if (woerter < 3 || !letztesZeichen.equals("?")) {
            throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n frageText muss aus mindestens 3 Worten bestehen und muss ein '?' als letztes Zeichen haben, ist aber" + frageText + "\n");
        }
        return true;
    }

    public boolean checkInstParaAntwList(List<Antworten> antwortSatz) {
        String abcdTest = "ABCD";
        String reihenfolgeABCD = "XXXX";
        int stufenTest = antwortSatz.get(0).getAntwortStufe();
        int index = 0;
        int countTRUE = 0;
        for (var a : antwortSatz) {
            abcdTest = abcdTest.replace(a.getOptionABCD(), "X");
            reihenfolgeABCD = reihenfolgeABCD.substring(0, index) + a.getOptionABCD() + reihenfolgeABCD.substring(index + 1);
            if (a.getRichtigeAntwort()) {
                countTRUE++;
            }
            if (stufenTest != a.getAntwortStufe()) {
                throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n stufe im antwortSatz muss bei allen 4 Eintraegen gleich sein!\n");
            }
            index++;
        }
        if (countTRUE != 1) {
            throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n richtigeAntwort im antwortSatz muss bei 4 Eintraegen genau 1x TRUE sein, ist aber: " + countTRUE + "x\n");
        }
        if (!abcdTest.equals("XXXX")) {
            throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n optionABCD im antwortSatz muss bei 4 Eintraegen je ein A, B, C und D haben, hat aber: " + reihenfolgeABCD + "\n");
        }
        if (!reihenfolgeABCD.equals("ABCD")) {
            throw new IllegalArgumentException("\n\n Fehler bei der Instanzerstellung!\n optionABCD im antwortSatz muss bei 4 Eintraegen die Reihenfolge A, B, C und D haben, hat aber: " + reihenfolgeABCD + "\n");
        }
        return true;
    }
}
