package de.mobile.taf.screenpersister.storage;

import java.util.HashMap;

public class ScreenData {

    private HashMap<Integer, String> data = new HashMap<Integer, String>();
    private IPersister screen;

    public ScreenData(IPersister screen) {
        this.screen = screen;
        data = new HashMap<Integer, String>();
    }

    // STORE entry of ID
    public void putString(Integer id, String value) {
        data.put(id, value);
    }

    public void putBool(Integer id, boolean value) {
        data.put(id, value+"");
    }

    public void putInt(Integer id, int value) {
        data.put(id, value+"");
    }

    // GET data for id
    public String getString(Integer id) {
        String value = data.get(id);
        if (value != null) {
            return value;
        }
        return "";
    }

    public boolean getBool(Integer id) {
        String entry = getString(id);
        return !entry.equalsIgnoreCase("false");
    }

    public int getInt(Integer id) {
        try {
            String entry = getString(id);
            int result = Integer.parseInt(entry);
            return result;

        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        return 0;
    }

    public void clear() {
        data.clear();
    }
}
