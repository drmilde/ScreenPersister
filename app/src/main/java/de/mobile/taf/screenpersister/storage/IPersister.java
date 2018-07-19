package de.mobile.taf.screenpersister.storage;

public interface IPersister {

    public boolean persist();
    public boolean restore();
    public boolean clear();

}
