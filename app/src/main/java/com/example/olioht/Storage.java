package com.example.olioht;

import java.util.HashMap;

public class Storage {

    private static Storage storage = null;
    private int id = 0;
    HashMap<Integer, Lutemon> LutemonHashMap = new HashMap<>();


    private Storage() {

    }

    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public Lutemon getLutemon(int id) {
        return LutemonHashMap.get(id);
    }

    public void addLutemon(Lutemon lutemon) {
        id++;
        LutemonHashMap.put(id, lutemon);
    }

    public HashMap<Integer, Lutemon> GetLutemonHashMap() {
        return LutemonHashMap;
    }
}
