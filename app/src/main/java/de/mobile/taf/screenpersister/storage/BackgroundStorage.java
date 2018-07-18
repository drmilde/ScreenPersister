package de.mobile.taf.screenpersister.storage;

public class BackgroundStorage {
    private static final BackgroundStorage ourInstance = new BackgroundStorage();

    // Hintergrundspeicher für alle Screens
    private ScreenStorage screenStorage = new ScreenStorage();

    public static BackgroundStorage getInstance() {
        return ourInstance;
    }

    private BackgroundStorage() {
    }


    // GETTER
    public ScreenStorage getScreenStorage() {
        return screenStorage;
    }
}
