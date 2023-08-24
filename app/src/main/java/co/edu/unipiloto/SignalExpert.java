package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SignalExpert extends AppCompatActivity {
    List<String> getType(String typeSignal) {
        List<String> listSignal = new ArrayList<>();

        if (typeSignal.equals("Regulatory Signals")) {
            listSignal.add("Stop sign");
            listSignal.add("Yield sign");
        }
        else {
            if (typeSignal.equals("Warning Signs")) {
                listSignal.add("Animal Crossing Sign");
                listSignal.add("Cyclist Crossing Signal");
            }
            else {
                if (typeSignal.equals("Informative Signs")) {
                    listSignal.add("Hospital sign");
                    listSignal.add("Town or City sign");
                }
                else {
                    listSignal.add("Exclusive Bicycle Lane Sign");
                    listSignal.add("Maximum Allowed Speed Sign");
                }
            }
        }
        return listSignal;
    }
}
