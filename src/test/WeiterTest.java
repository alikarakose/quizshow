package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WeiterTest {

    @Test
    void setRichtig() {
    }

    @Test
    void setStopTestTrue() {
        Weiter weitertest = new Weiter(true, false, 1);
        weitertest.setStop(true);
        assertThat(weitertest.getStop()).isTrue();
    }

    @Test
    void setAktuelleStufe() {
        Weiter weitertest = new Weiter(true, false, 1);
        weitertest.setAktuelleStufe(2);
        assertThat(weitertest.getAktuelleStufe()).isEqualTo(2);
    }
    @Test
    void setAktuelleStufe13() {
        Weiter weitertest = new Weiter(true, false, 14);
        weitertest.setStop(true);
        assertThat(weitertest.getAktuelleStufe()).isEqualTo(13);
    }
}