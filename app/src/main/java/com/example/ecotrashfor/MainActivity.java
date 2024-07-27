package com.example.ecotrashfor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText numeroRepeticiones;
    private Button button;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroRepeticiones=findViewById(R.id.numeroRepeticiones);
        button=findViewById(R.id.button);
        resultado=findViewById(R.id.resultado);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
                {
                    int repetitions=Integer.parseInt(numeroRepeticiones.getText().toString());

                    String forResult="";
                    for (int i=0; i<repetitions; i++)
                    {
                        forResult += "Recogida de basura"+(i+1)+"Completado \n";
                    }

                    String whileResult="";
                    int count=0;
                    while (count<repetitions)
                    {
                        whileResult+="Desperdicio"+(count+1)+"Reciclado correctamente \n";
                        count++;
                    }
                    resultado.setText("Resultado ciclo for: \n" + forResult +"\n" + "Resultado ciclo while\n" + whileResult);
                }
        });
    }
}