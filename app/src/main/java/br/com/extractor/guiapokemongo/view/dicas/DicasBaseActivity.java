package br.com.extractor.guiapokemongo.view.dicas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.extractor.guiapokemongo.R;
import br.com.extractor.guiapokemongo.model.ContentKey;

public class DicasBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            int content = parametros.getInt("content");

            switch (content) {
                case ContentKey.DICA_GUIA_INICIAL:
                    setContentView(R.layout.dicas_guia_inicial);
                    break;

                case ContentKey.DICA_EVOLUCAO_EEVEE:
                    setContentView(R.layout.dicas_evolucao_eevee);
                    break;

                case ContentKey.DICA_COMECANDO_PIKACHU:
                    setContentView(R.layout.dicas_comecando_pikachu);
                    break;

                case ContentKey.DICA_COMO_ENCONTRAR_POKEMON:
                    setContentView(R.layout.dicas_como_encontrar_pokemon);
                    break;

                case ContentKey.DICA_CHOCANDO_OVOS:
                    setContentView(R.layout.dicas_chocando_ovos);
                    break;

                case ContentKey.DICA_COMO_JOGAR_POKEBALL:
                    setContentView(R.layout.dicas_como_jogar_pokeball);
                    break;

                case ContentKey.DICA_POKE_STOP:
                    setContentView(R.layout.dicas_poke_stop);
                    break;

                case ContentKey.DICA_ZONAS_SPAWN:
                    setContentView(R.layout.dicas_zonas_spawn);
                    break;

                case ContentKey.DICA_NINHOS_POKEMON:
                    setContentView(R.layout.dicas_ninhos_pokemon);
                    break;

                case ContentKey.DICA_SUBINDO_NIVEL:
                    setContentView(R.layout.dicas_subindo_nivel);
                    break;

                default:
                    setContentView(R.layout.activity_dicas_base);
                    break;
            }
        } else {
            setContentView(R.layout.activity_dicas_base);
        }
    }
}
