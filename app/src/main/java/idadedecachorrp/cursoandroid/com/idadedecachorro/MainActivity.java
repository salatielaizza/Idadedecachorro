package idadedecachorrp.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView caixaTexto;
    private Button botaoIdade;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (TextView) findViewById(R.id.caixaTextoID);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeID);
        resultado = (TextView) findViewById(R.id.resultadoIdadeID);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //recupara oq foi digitado e transforma em Strind
                String textoDigitado = caixaTexto.getText().toString();

                if ( textoDigitado.isEmpty()){
                    resultado.setText(" Não foi digitado nada");
                }else {

                    //transforma o String textoDigitado em int. Quem faz isto é o método parseInt que está denro da classe Integer
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    resultado.setText("O idade humana do cachorro é " + resultadoFinal + " anos");
                }
            }
        });
    }
}