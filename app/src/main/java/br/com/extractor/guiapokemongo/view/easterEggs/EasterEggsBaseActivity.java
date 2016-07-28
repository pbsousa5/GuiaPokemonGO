package br.com.extractor.guiapokemongo.view.easterEggs;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import br.com.extractor.guiapokemongo.R;
import br.com.extractor.guiapokemongo.model.ContentKey;

public class EasterEggsBaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            int content = parametros.getInt("content");

            switch (content) {
                case ContentKey.DICA_EVOLUCAO_EEVEE:
                    setContentView(R.layout.dicas_evolucao_eevee);
                    break;

                case ContentKey.DICA_COMECANDO_PIKACHU:
                    setContentView(R.layout.dicas_comecando_pikachu);
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
