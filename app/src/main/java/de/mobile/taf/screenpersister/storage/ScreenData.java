package de.mobile.taf.screenpersister.storage;

import java.util.HashMap;

public class ScreenData {

    private HashMap<Integer, String> data = new HashMap<Integer, String>();

    public ScreenData() {
        data = new HashMap<Integer, String>();
    }

    // GETTER

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


}
