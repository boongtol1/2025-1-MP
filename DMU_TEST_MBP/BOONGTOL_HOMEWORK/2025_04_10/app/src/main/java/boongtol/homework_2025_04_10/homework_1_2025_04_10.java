package boongtol.homework_2025_04_10;


import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class homework_1_2025_04_10 extends AppCompatActivity {

    private Button toggleButton, greetButton;
    private EditText editIntro;
    private TextView resultTextView;

    private CheckBox checkAndroid, checkIOS, checkWeb, checkAI, checkIoT, checkXR;
    private boolean isEditing = false;
    private String name = "이승훈";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_1_2025_04_10);

        // 버튼, 텍스트, 체크박스 초기화
        toggleButton = findViewById(R.id.toggleButton);
        greetButton = findViewById(R.id.greetButton);
        editIntro = findViewById(R.id.editIntro);
        resultTextView = findViewById(R.id.textResult);

        checkAndroid = findViewById(R.id.checkAndroid);
        checkIOS = findViewById(R.id.checkIOS);
        checkWeb = findViewById(R.id.checkWeb);
        checkAI = findViewById(R.id.checkAI);
        checkIoT = findViewById(R.id.checkIoT);
        checkXR = findViewById(R.id.checkXR);

        // 수정/저장 토글 버튼
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isEditing = !isEditing;
                toggleButton.setText(isEditing ? "저장" : "수정");

                setEditable(isEditing);

                if (!isEditing) {
                    ArrayList<String> selected = new ArrayList<>();
                    if (checkAndroid.isChecked()) selected.add("Android");
                    if (checkIOS.isChecked()) selected.add("iOS");
                    if (checkWeb.isChecked()) selected.add("Web");
                    if (checkAI.isChecked()) selected.add("AI");
                    if (checkIoT.isChecked()) selected.add("IoT");
                    if (checkXR.isChecked()) selected.add("XR");

                    String result = "관심 기술: " + String.join(" ", selected);
                    resultTextView.setText(result);
                }
            }
        });

        // 인사하기 버튼
        greetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(homework_1_2025_04_10.this, name + "님 반갑습니다!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // 체크박스 + EditText 활성화 / 비활성화
    private void setEditable(boolean enabled) {
        checkAndroid.setEnabled(enabled);
        checkIOS.setEnabled(enabled);
        checkWeb.setEnabled(enabled);
        checkAI.setEnabled(enabled);
        checkIoT.setEnabled(enabled);
        checkXR.setEnabled(enabled);
        editIntro.setEnabled(enabled);
    }
}
