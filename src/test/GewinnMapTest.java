package edu.pruefung.gruppe1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GewinnMapTest {

    GewinnMap mapGewinnStufenTest = new GewinnMap();

    @Test
    void trageEinKeyTest() {
        mapGewinnStufenTest.trageEin(1,50);
        boolean istKeyVorhanden = mapGewinnStufenTest.mapGewinnStufen.containsKey(1);
        assertThat(istKeyVorhanden).isTrue();
    }
    @Test
    void trageEinValueTest() {
        mapGewinnStufenTest.trageEin(2,50);
        int value = mapGewinnStufenTest.mapGewinnStufen.get(2);
        assertThat(value).isEqualTo(50);
    }
    @Test
    void trageEinSizeTest() {
        mapGewinnStufenTest.trageEin(1,100);
        mapGewinnStufenTest.trageEin(2,150);
        mapGewinnStufenTest.trageEin(3,200);
        int size = mapGewinnStufenTest.mapGewinnStufen.size();
        assertThat(size).isEqualTo(3);
    }


}