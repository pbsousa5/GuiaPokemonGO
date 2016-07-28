package br.com.extractor.guiapokemongo.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.extractor.guiapokemongo.R;
import br.com.extractor.guiapokemongo.view.dicas.DicasActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_pokedex = (Button) findViewById(R.id.btn_pokedex);
        btn_pokedex.setVisibility(View.GONE);
        btn_pokedex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button btn_itens = (Button) findViewById(R.id.btn_itens);
        btn_itens.setVisibility(View.GONE);
        btn_itens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button btn_moves = (Button) findViewById(R.id.btn_moves);
        btn_moves.setVisibility(View.GONE);
        btn_moves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button btn_dicas = (Button) findViewById(R.id.btn_dicas);
        btn_dicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DicasActivity.class));
            }
        });

        Button btn_easter_eggs = (Button) findViewById(R.id.btn_easter_eggs);
        btn_easter_eggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DicasActivity.class));
            }
        });
    }
}
