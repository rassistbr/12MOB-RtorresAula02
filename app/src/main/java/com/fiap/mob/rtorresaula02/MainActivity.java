package com.fiap.mob.rtorresaula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.security.spec.ECField;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumero1, edtNumero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero1 = (EditText) findViewById(R.id.edtNumero1);
        edtNumero2 = (EditText) findViewById(R.id.edtNumero2);
    }

    public void mtdSomar(View v){
        try{
            int intNumero1 = Integer.parseInt(edtNumero1.getText().toString());
            int intNumero2 = Integer.parseInt(edtNumero2.getText().toString());
            int intSoma = intNumero1 + intNumero2;
            Toast.makeText(MainActivity.this, getString(R.string.txtResultado) + String.valueOf(intSoma), Toast.LENGTH_SHORT).show();
        }
        catch(Exception ex) {
            Toast.makeText(MainActivity.this, ex.getMessage().toString(), Toast.LENGTH_SHORT).show();
        }
    }

}
