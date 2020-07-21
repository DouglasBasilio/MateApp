package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);

        final EditText edtKm_prog = (EditText) findViewById(R.id.edtKm);
        final EditText edtM_prog = (EditText) findViewById(R.id.edtM);
        Button btnConverter_prog = (Button) findViewById(R.id.btnConverter);

        //Ação de click do botão
        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Declaração de variáveis
                float km, m;
                //Leitura e atribuição do valor de m.
                //Obs.: o valor vem como "String" do "PlainText"
                //vamos converter em número através do
                //"Float.parseFloat"
                m = Float.parseFloat(edtM_prog.getText().toString());
                //Calculo para converter "Metro" em "Km"
                km = m / 1000;
                //Conversão de número para "String", para mostrar o resultado na Tela
                edtKm_prog.setText(String.valueOf(km));
            }
        });
    }
}
