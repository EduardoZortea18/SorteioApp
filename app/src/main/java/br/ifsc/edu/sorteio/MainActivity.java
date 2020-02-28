package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

  Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Sortear(View view) {

        TextView textView = findViewById(R.id.Resultado);
        EditText editTextInicial = findViewById(R.id.TextInicial);
        EditText editTextFinal = findViewById(R.id.TextFinal);

        int inicial = Integer.parseInt(editTextInicial.getText().toString());
        int fina = Integer.parseInt(editTextFinal.getText().toString());
        random= new Random();
        int numeroSorteado = random.nextInt( (fina - inicial) + inicial);

        textView.setText(Integer.toString(numeroSorteado));
    }
}
