package br.com.extractor.guiapokemongo.view.dicas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.extractor.guiapokemongo.R;
import br.com.extractor.guiapokemongo.model.ContentKey;

public class DicasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas);

        Button btn_guia_inicial = (Button) findViewById(R.id.btn_guia_inicial);
        btn_guia_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_GUIA_INICIAL);
            }
        });

        Button btn_eevee_evolution = (Button) findViewById(R.id.btn_eevee_evolution);
        btn_eevee_evolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_EVOLUCAO_EEVEE);
            }
        });

        Button btn_pikachu_starter = (Button) findViewById(R.id.btn_pikachu_starter);
        btn_pikachu_starter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_COMECANDO_PIKACHU);
            }
        });

        Button btn_encontrar_pokemon = (Button) findViewById(R.id.btn_encontrar_pokemon);
        btn_encontrar_pokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_COMO_ENCONTRAR_POKEMON);
            }
        });

        Button btn_chocando_ovos = (Button) findViewById(R.id.btn_chocando_ovos);
        btn_chocando_ovos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_CHOCANDO_OVOS);
            }
        });

        Button btn_jogar_pokebola = (Button) findViewById(R.id.btn_jogar_pokebola);
        btn_jogar_pokebola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_COMO_JOGAR_POKEBALL);
            }
        });

        Button btn_poke_stop = (Button) findViewById(R.id.btn_poke_stop);
        btn_poke_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_POKE_STOP);
            }
        });

        Button btn_spawn_pokemon = (Button) findViewById(R.id.btn_spawn_pokemon);
        btn_spawn_pokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_ZONAS_SPAWN);
            }
        });

        Button btn_ninhos_pokemon = (Button) findViewById(R.id.btn_ninhos_pokemon);
        btn_ninhos_pokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_NINHOS_POKEMON);
            }
        });

        Button btn_upando = (Button) findViewById(R.id.btn_upando);
        btn_upando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDicasActivity(ContentKey.DICA_SUBINDO_NIVEL);
            }
        });
    }

    private void startDicasActivity(int contentKey) {
        Bundle parametros = new Bundle();
        parametros.putInt("content", contentKey);

        Intent intent = new Intent(this, DicasBaseActivity.class);
        intent.putExtras(parametros);

        startActivity(intent);
    }
}
