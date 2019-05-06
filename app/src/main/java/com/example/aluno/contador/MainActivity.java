package com.example.aluno.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView resultado1;
    private TextView resultado2;
    private TextView time1;
    private TextView time2;
    private TextView versus1;
    private Button mais1;
    private Button mais2;
    private Button fimdejogo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado1 = (TextView) findViewById(R.id.txtresultadoa);
        resultado2 = (TextView) findViewById(R.id.txtresultadob);
        time1 = (TextView) findViewById(R.id.timea);
        time2 = (TextView) findViewById(R.id.timeb);
        versus1 = (TextView) findViewById(R.id.versus);
        mais1 = (Button) findViewById(R.id.maisa);
        mais2 = (Button) findViewById(R.id.maisb);
        fimdejogo1 = (Button) findViewById(R.id.fimdejogo);

        mais1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double n1 = Double.parseDouble(resultado1.getText().toString());
                    n1 = n1+1;
                    resultado1.setText(""+n1);

                } catch (Exception E){
                    Toast.makeText(MainActivity.this,"Erro",Toast.LENGTH_LONG).show();
                }
            }
        });
        mais2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double n2 = Double.parseDouble(resultado2.getText().toString());
                    n2 = n2+1;
                    resultado2.setText(""+n2);

                }catch (Exception E) {
                    Toast.makeText(MainActivity.this,"Erro",Toast.LENGTH_LONG).show();
                }
            }
        });
        fimdejogo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        fimdejogo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double n1 = Double.parseDouble(resultado1.getText().toString());
                    Double n2 = Double.parseDouble(resultado2.getText().toString());
                    if (n1 > n2) {
                        Toast.makeText(MainActivity.this, "Time A venceu!", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Time B venceu!", Toast.LENGTH_LONG).show();
                    }
                    resultado1.setText("0");
                    resultado2.setText("0");
                } catch (Exception E) {
                    Toast.makeText(MainActivity.this, "Erro", Toast.LENGTH_LONG).show();
                }
            }
        });









    }
}
