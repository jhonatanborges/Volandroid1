package volandroid.com.br.volandroid1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {

    public Button btnIniciar, btnParear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        btnIniciar = (Button) findViewById(R.id.button3);
        btnParear = (Button) findViewById(R.id.button4);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TelaInicial.this,SelecaoJogos.class);
                startActivity(it);
            }
        });

        btnParear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TelaInicial.this,TelaDispositivos.class);
                startActivity(it);
            }
        });

    }
}
