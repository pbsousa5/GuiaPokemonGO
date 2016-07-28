package br.com.extractor.guiapokemongo.view.easterEggs;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.extractor.guiapokemongo.R;
import br.com.extractor.guiapokemongo.model.ContentKey;
import br.com.extractor.guiapokemongo.view.dicas.DicasBaseActivity;

public class EasterEggsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easter_eggs);

        Button btn_pikachu_starter = (Button) findViewById(R.id.btn_pikachu_starter);
        btn_pikachu_starter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEasterEggsActivity(ContentKey.DICA_COMECANDO_PIKACHU);
            }
        });

        Button btn_eevee_evolution = (Button) findViewById(R.id.btn_eevee_evolution);
        btn_eevee_evolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEasterEggsActivity(ContentKey.DICA_EVOLUCAO_EEVEE);
            }
        });
    }

    private void startEasterEggsActivity(int contentKey) {
        Bundle parametros = new Bundle();
        parametros.putInt("content", contentKey);

        Intent intent = new Intent(this, EasterEggsBaseActivity.class);
        intent.putExtras(parametros);

        startActivity(intent);
    }

}
