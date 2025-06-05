package boongtol.homework_2025_04_02;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class homework_3_2025_04_02 extends AppCompatActivity {

    ImageView imgTarget;
    Button btnRotate;
    float currentRotation = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_3_2025_04_02);

        imgTarget = findViewById(R.id.imgTarget);
        btnRotate = findViewById(R.id.btnRotate);

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentRotation += 10f;
                imgTarget.setRotation(currentRotation);
            }
        });
    }
}
