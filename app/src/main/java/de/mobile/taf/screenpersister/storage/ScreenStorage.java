package de.mobile.taf.screenpersister.storage;

import java.util.HashMap;

public class ScreenStorage {

    private HashMap<String, ScreenData> storage = null;

    public ScreenStorage() {
        storage = new HashMap<String, ScreenData>();
    }

    public void put(String id, ScreenData sp) {
        storage.put(id, sp);
    }

    public ScreenData get(String id) {
        return storage.get(id);
    }

    public boolean containsKey (String id) {
        return storage.containsKey(id);
    }
}
