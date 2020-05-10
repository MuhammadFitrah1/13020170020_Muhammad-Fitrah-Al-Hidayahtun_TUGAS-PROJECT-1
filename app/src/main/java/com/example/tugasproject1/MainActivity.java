package com.example.tugasproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText panjang,lebar,tinggi;
    private TextView volume;
    private Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang =findViewById(R.id.panjang);
        lebar =findViewById(R.id.lebar);
        tinggi =findViewById(R.id.tinggi);
        volume =findViewById(R.id.volume);
        btnHitung =findViewById(R.id.btnhitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p,l,t,h;
                p = Integer.parseInt(panjang.getText().toString());
                l = Integer.parseInt(lebar.getText().toString());
                t = Integer.parseInt(tinggi.getText().toString());
                h = p*l/3*t;
                volume.setText("VOLUME LIMAS SEGIEMPAT = "+h);

            }
        });
    }
}
