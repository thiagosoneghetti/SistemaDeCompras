package sistemadecompras.devandroid.com.sistemadecompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//extends Activity

    private CheckBox checkBoxArroz;
    private CheckBox checkBoxLeite;
    private CheckBox checkBoxCarne;
    private CheckBox checkBoxFeijao;
    private CheckBox checkBoxRefri;

    private Button botaoCalc;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxArroz = (CheckBox) findViewById(R.id.checkBoxArrozId);
        checkBoxLeite = (CheckBox) findViewById(R.id.checkBoxLeiteId);
        checkBoxCarne = (CheckBox) findViewById(R.id.checkBoxCarneId);
        checkBoxFeijao = (CheckBox)findViewById(R.id.checkBoxFeijaoId);
        checkBoxRefri = (CheckBox) findViewById(R.id.checkBoxRefriId);

        botaoCalc = (Button) findViewById(R.id.botaoCalcId);
        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);

        botaoCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultadoCalc = 0;

                if(checkBoxArroz.isChecked() == true){
                    resultadoCalc +=  2.69;
                }
                if(checkBoxLeite.isChecked() == true){
                    resultadoCalc +=  5.00;
                }
                if(checkBoxCarne.isChecked() == true){
                    resultadoCalc +=  10.00;
                }
                if(checkBoxFeijao.isChecked() == true){
                    resultadoCalc +=  2.30;
                }
                if(checkBoxRefri.isChecked() == true){
                    resultadoCalc +=  2.00;
                }

               textoExibicao.setText("Total de R$"+resultadoCalc);
            }
        });


    }
}
