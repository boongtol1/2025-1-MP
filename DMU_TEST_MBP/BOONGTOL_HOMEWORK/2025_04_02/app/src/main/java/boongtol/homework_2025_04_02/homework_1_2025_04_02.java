package boongtol.homework_2025_04_02;


import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

public class homework_1_2025_04_02 extends AppCompatActivity {

    CheckBox chkEnabled, chkClickable, chkRotate;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_1_2025_04_02);

        chkEnabled = findViewById(R.id.chkEnabled);
        chkClickable = findViewById(R.id.chkClickable);
        chkRotate = findViewById(R.id.chkRotate);
        myButton = findViewById(R.id.myButton);

        chkEnabled.setOnCheckedChangeListener((buttonView, isChecked) -> {
            myButton.setEnabled(isChecked);
        });

        chkClickable.setOnCheckedChangeListener((buttonView, isChecked) -> {
            myButton.setClickable(isChecked);
        });

        chkRotate.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                myButton.setRotation(45f);
            } else {
                myButton.setRotation(0f);
            }
        });
    }
}
