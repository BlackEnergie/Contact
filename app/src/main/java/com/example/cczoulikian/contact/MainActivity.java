package com.example.cczoulikian.contact;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonMonProfil = (Button) findViewById(R.id.btnProfil);
        buttonMonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MonProfilActivity.class);
                startActivity(Intent);
            }
        });
    }

}
