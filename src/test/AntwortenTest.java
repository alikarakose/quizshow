package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AntwortenTest {
    @Test
    void checkInstParaStufeTestTrue() {
        int stufe = 2;
        assertThat(new ParameterCheck().checkInstParaStufe(stufe)).isTrue();
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
}