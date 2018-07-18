package de.mobile.taf.screenpersister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.mobile.taf.screenpersister.screens.AdressenEingabe;
import de.mobile.taf.screenpersister.storage.ScreenStorage;

public class MainActivity extends AppCompatActivity {


    private Button btn_addresseingabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_addresseingabe = findViewById(R.id.btn_addresseingabe);
        btn_addresseingabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AdressenEingabe.class);
                startActivity(intent);
            }
        });

        initializeBackgroundStorage();

    }

    private void initializeBackgroundStorage() {
        ScreenStorage
    }
}
