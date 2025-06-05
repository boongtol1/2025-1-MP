package boongtol.homework_2025_04_02;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class homework_2_2025_04_02 extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_2_2025_04_02);
        editText = findViewById(R.id.editText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 사용 안 함
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // 사용 안 함
            }

            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(homework_2_2025_04_02.this, s.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

