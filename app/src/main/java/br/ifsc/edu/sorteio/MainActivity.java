package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText NumInicialC, NumFinalC;
    TextView ResultadoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Sortear(View view) {

        EditText NumInicialC = findViewById(R.id.NumInicial);
        EditText NumFinalC   = findViewById(R.id.NumFinal);
        EditText ResultadoC  = new Random().nextInt(NumFinalC - NumInicialC)+NumInicialC;

        int numinicial = Integer.parseInt(NumInicialC.getText().toString());

        int numfinal = Integer.parseInt(NumFinalC.getText().toString());

        ResultadoC.setText(Integer.toString(ResultadoC);
    }
}
