package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindSignalActivity extends AppCompatActivity {

    private SignalExpert expert = new SignalExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.btn_find_signal);

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //obtiene una referencia del textView
                TextView msgEnd = (TextView) findViewById(R.id.msg_end);

                //obtiene una referencia del spinner
                Spinner choseSignal = (Spinner) findViewById(R.id.choose_item);

                //obtiene la seleccion del item en el spinner
                String signalType = String.valueOf(choseSignal.getSelectedItem());

                //mostar el elemento seleccionado
                msgEnd.setText(signalType);

                //obtiene las recomendaciones de la clase SignalExpert
                StringBuilder signalFormatted = new StringBuilder();
                List<String> listSignal = expert.getType(signalType);

                for (String signal : listSignal) {
                    signalFormatted.append(signal).append("\n");
                }
                msgEnd.setText(signalFormatted.toString());
            }
        });
    }








    }