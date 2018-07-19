package de.mobile.taf.screenpersister.screens.persister;

import android.widget.EditText;

import de.mobile.taf.screenpersister.R;
import de.mobile.taf.screenpersister.screens.AdressenEingabe;
import de.mobile.taf.screenpersister.storage.BackgroundStorage;
import de.mobile.taf.screenpersister.storage.IPersister;
import de.mobile.taf.screenpersister.storage.ScreenData;

public class AdressenEingabePersister implements IPersister {
    private final String PERSISTER_ID = "AdressenEingabe";
    private ScreenData data = null;
    private AdressenEingabe view = null;

    // Felder der Eingabe
    private EditText et_nachname = null;
    private EditText et_vorname = null;


    public AdressenEingabePersister(AdressenEingabe v) {
        this.view = v;

        // felder holen
        et_nachname = view.findViewById(R.id.et_adresseingabe_nachname);
        et_vorname = view.findViewById(R.id.et_adresseingabe_vorname);
    }

    @Override
    public boolean persist() {
        getCreateScreenData();

        // transmit form data
        String nachname = et_nachname.getText().toString();
        data.putString(R.id.et_adresseingabe_nachname, nachname);
        String vorname = et_vorname.getText().toString();
        data.putString(R.id.et_adresseingabe_vorname, vorname);


        storeScreenData();

        return true;
    }


    @Override
    public boolean restore() {
        getCreateScreenData();

        et_nachname.setText(data.getString(R.id.et_adresseingabe_nachname));
        et_vorname.setText(data.getString(R.id.et_adresseingabe_vorname));

        return false;
    }

    @Override
    public boolean clear() {
        data.clear();
        persist();
        restore();

        return false;
    }


    // helper
    private void storeScreenData() {
        // store it in BackgroundStorage
        BackgroundStorage.getInstance().getScreenStorage().put(PERSISTER_ID, data);
    }

    private void getCreateScreenData() {
        data = BackgroundStorage.getInstance().getScreenStorage().get(PERSISTER_ID, this);
    }

    // helper to clear the form
    public void clearForm() {
        et_nachname.setText("");
        et_vorname.setText("");
    }
}
