package com.example.elisa.pr_actividades1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView textView;
    String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        textView = (TextView) findViewById(R.id.textView);
        mensaje = getMensaje();
        if (!mensaje.equals(null)) {
            textView.setText(mensaje);
        }
    }

    public String getMensaje() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                if (intent.hasExtra("MENSAJE")) {
                    return bundle.getString("MENSAJE");
                }
            }
        }
        return null;
    }

}
