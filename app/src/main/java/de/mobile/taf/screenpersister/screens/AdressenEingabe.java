package de.mobile.taf.screenpersister.screens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import de.mobile.taf.screenpersister.R;
import de.mobile.taf.screenpersister.screens.persister.AdressenEingabePersister;
import de.mobile.taf.screenpersister.storage.BackgroundStorage;
import de.mobile.taf.screenpersister.storage.IPersister;
import de.mobile.taf.screenpersister.storage.ScreenData;

public class AdressenEingabe extends AppCompatActivity {
    private AdressenEingabePersister aep = null;

    private Button btn_restore;
    private Button btn_persist;
    private Button btn_clear_form;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adressen_eingabe);


        // Restore the Data from BackgroundStore
        // erzeuge Persister, verbinde mit Screen und initialisiere
        // mit gespeicherten Daten
        aep = new AdressenEingabePersister(this);
        aep.restore();



        // attach listeners
        btn_clear_form = findViewById(R.id.btn_clear_form);
        btn_clear_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aep.clearForm();
            }
        });

        btn_persist = findViewById(R.id.btn_persist);
        btn_persist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aep.persist();
            }
        });

        btn_restore = findViewById(R.id.btn_restore);
        btn_restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aep.restore();
            }
        });
    }

}
