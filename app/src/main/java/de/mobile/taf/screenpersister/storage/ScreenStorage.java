package de.mobile.taf.screenpersister.storage;

import java.util.HashMap;

public class ScreenStorage {

    private HashMap<IPersister, ScreenData> storage = null;

    public ScreenStorage() {
        storage = new HashMap<IPersister, ScreenData>();
    }

    public void put(IPersister id, ScreenData sp) {
        storage.put(id, sp);
    }

    public ScreenData get(IPersister id) {
        return storage.get(id);
    }
}
