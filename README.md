# MateApp
Java | Android Studio | App

O *MateApp*  foi desenvolvido no **Android Studio**. Este app tem como objetivo realizar a conversão de Km para Metros e de Metros para Km.

Para tal, criei três **Activitys** (telas):

1. main
2. km_m
3. m_km

Para a programação, utilizei Java.

Abaixo, segue um exemplo de código, que será executado ao clicar no botão **Converter**.

```java
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

```

Na sequência, temos as telas do aplicativo:

**Tela Inicial do Aplicativo**

<a href="https://imgur.com/FehfEAh"><img src="https://i.imgur.com/FehfEAh.png" title="source: imgur.com" /></a>

**Tela de Conversão Km - Metros**

<a href="https://imgur.com/WDyemst"><img src="https://i.imgur.com/WDyemst.png" title="source: imgur.com" /></a>

**Tela com o resultado da conversão de Km - Metros**

<a href="https://imgur.com/eKit2AT"><img src="https://i.imgur.com/eKit2AT.png" title="source: imgur.com" /></a>

**Tela de Conversão Metros - Km**

<a href="https://imgur.com/q11w7pH"><img src="https://i.imgur.com/q11w7pH.png" title="source: imgur.com" /></a>

**Tela com o resultado da conversão de Metros - Km**

<a href="https://imgur.com/emNEXtD"><img src="https://i.imgur.com/emNEXtD.png" title="source: imgur.com" /></a>

2020-07-21 16:48:26 Tuesday
