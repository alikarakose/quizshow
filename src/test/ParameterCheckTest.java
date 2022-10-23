package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParameterCheckTest {

    Teilnehmer teilnehmer01 = new Teilnehmer("John", new Weiter(true, false, 1));
    List<Antworten> antwortSatz001Stufe01 = List.of(
            new Antworten(1, "Gruen", "A", false),
            new Antworten(1, "Blau", "B", true),
            new Antworten(1, "Rot", "C", false),
            new Antworten(1, "Gelb", "D", false));
    Fragen frage001Stufe01 = new Fragen(false, 1, "Welche Farbe gibt es in einer Ampel nicht?", antwortSatz001Stufe01);

    @Test
    void checkInstParaStufeTestTrue() {
        assertThat(new ParameterCheck().checkInstParaStufe(1)).isTrue();
    }

    @Test
    void checkInstParaStufeTestFalseKleiner() {
        int stufe = 0;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Antworten(0, "F", "E", false));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n stufe muss eine ganze zahl zwischen 1 und 15 sein, ist aber: " + stufe + " !\n");
    }

    @Test
    void checkInstParaStufeTestFalseGroesser() {
        int stufe = 16;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Antworten(16, "F", "E", false));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n stufe muss eine ganze zahl zwischen 1 und 15 sein, ist aber: " + stufe + " !\n");
    }

    @Test
    void checkInstParaOptionABCD_TestGrossFalse() {
        String optionABCD = "E";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Antworten(1, "F", "E", false));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n optionABCD muss A, B, C oder D sein, ist aber: " + optionABCD + " !\n");
    }

    @Test
    void checkInstParaOptionABCD_TestGrossTrue() {
        assertThat(new ParameterCheck().checkInstParaOptionABCD("A")).isTrue();
    }

    @Test
    void checkInstParaAntwTxtTestEmptyFalse() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Antworten(1, "", "E", false));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n antwortText darf nicht leer sein oder nur aus Leerzeichen bestehen!\n");
    }

    @Test
    void checkInstParaAntwTxtTestEmptyTrue() {
        assertThat(new ParameterCheck().checkInstParaAntwTxt("test")).isTrue();
    }

    @Test
    void checkInstParaAntwTxtTestLeerzeichenFalse() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Antworten(1, " ", "E", false));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n antwortText darf nicht leer sein oder nur aus Leerzeichen bestehen!\n");
    }

    @Test
    void checkInstParaAntwTxtTestLeerzeichenTrue() {
        assertThat(new ParameterCheck().checkInstParaAntwTxt("test")).isTrue();
    }

    @Test
    void checkInstParaAntwTxtTestBoolFalse() {
        Antworten testantwort = new Antworten(1, "test", "a", false);
        assertThat(testantwort.getRichtigeAntwort()).isFalse();
    }

    @Test
    void checkInstParaAntwTxtTestBoolTrue() {
        Antworten testantwort = new Antworten(1, "test", "a", true);
        assertThat(testantwort.getRichtigeAntwort()).isTrue();
    }

    @Test
    void checkInstParaNameTestEmpty() {
        String name = "";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Teilnehmer("", new Weiter(true, false, 1)));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n name darf nicht leer sein, nur aus Leerzeichen oder anderen Zeichen als A-Z a-z Umlaute sz -.' bestehen, ist aber: " + name + "\n");
    }

    @Test
    void checkInstParaNameTestLeerzeichenTrim() {
        Teilnehmer tester = new Teilnehmer(" john ", new Weiter(true, false, 1));
        assertThat(tester.getTnName()).isEqualTo("john");
    }

    @Test
    void checkInstParaNameTestKurz() {
        String name = "j";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Teilnehmer("j", new Weiter(true, false, 1)));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n name darf nicht leer sein, nur aus Leerzeichen oder anderen Zeichen als A-Z a-z Umlaute sz -.' bestehen, ist aber: " + name + "\n");
    }

    @Test
    void checkInstParaNameTestSonder() {
        String name = "john&!§%&";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Teilnehmer("john&!§%&", new Weiter(true, false, 1)));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n name darf nicht leer sein, nur aus Leerzeichen oder anderen Zeichen als A-Z a-z Umlaute sz -.' bestehen, ist aber: " + name + "\n");
    }

    @Test
    void checkInstParaFrageTxt() {
        Fragen frage001Stufe01 = new Fragen(false, 1, "Welche Farbe gibt es in einer Ampel nicht?", antwortSatz001Stufe01);
        assertThat(frage001Stufe01.getFrageText()).isEqualTo("Welche Farbe gibt es in einer Ampel nicht?");
    }

    @Test
    void checkInstParaFrageTxtFZ() {
        Fragen frage001Stufe01 = new Fragen(false, 1, "Wer will mehr?", antwortSatz001Stufe01);
        assertThat(frage001Stufe01.getFrageText().charAt(13)).isEqualTo('?');
    }

    @Test
    void checkInstParaFrageTxtAnzW() {
        String frageText = "Werw";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Fragen(false, 1, "Werw", antwortSatz001Stufe01));
        assertThat(exception).hasMessage("\n\n Fehler bei der Instanzerstellung!\n frageText muss aus mindestens 3 Worten bestehen und muss ein '?' als letztes Zeichen haben, ist aber" + frageText + "\n");
    }
}