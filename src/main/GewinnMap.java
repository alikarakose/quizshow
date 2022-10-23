package edu.pruefung.gruppe1;

import java.util.HashMap;

public class GewinnMap {
    HashMap<Integer, Integer> mapGewinnStufen = new HashMap<>();

    public void trageEin(Integer key, Integer value) {
        mapGewinnStufen.put(key, value);
    }
}
