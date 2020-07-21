package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KmM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km_m);

        final EditText edtKm_prog = (EditText) findViewById(R.id.edtKm);
        final EditText edtM_prog = (EditText) findViewById(R.id.edtM);
        Button btnConverter_prog = (Button) findViewById(R.id.btnConverter);

        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float km, m;
                km = Float.parseFloat(edtKm_prog.getText().toString());
                m = km * 1000;
                edtM_prog.setText(String.valueOf(m));
            }
        });
    }
}
