package com.example.elisa.suma2numeros_v0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int num1, num2, resultado;
    private EditText cn1, cn2;
    private TextView cresultado;
    private Button btnAceptar;
    private RadioButton suma, resta, multiplicacion, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        cn1 = (EditText) findViewById(R.id.numero1);
        cn2 = (EditText) findViewById(R.id.numero2);
        btnAceptar = (Button) findViewById(R.id.button);
        cresultado = (TextView) findViewById(R.id.textView3);

        suma = (RadioButton) findViewById(R.id.sumar);
        resta = (RadioButton) findViewById(R.id.restar);
        multiplicacion = (RadioButton) findViewById(R.id.multiplicar);
        division = (RadioButton) findViewById(R.id.dividir);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(cn1.getText().toString());
                num2 = Integer.parseInt(cn2.getText().toString());

                if (resta.isChecked()) {
                    resultado = num1 - num2;
                } else if (multiplicacion.isChecked()) {
                    resultado = num1 * num2;
                } else if (division.isChecked()) {
                    resultado = num1 / num2;
                } else {
                    resultado = num1 + num2;
                }

                cresultado.setText(Integer.toString(resultado));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
