package boongtol.homework_2025_06_04;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class homework_3_2025_06_04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_3_2025_06_04);
        setTitle("스피너 영화 포스터");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        // 제목 배열: 영화 1 ~ 영화 83
        final String[] movie = new String[83];
        for (int i = 0; i < 83; i++) {
            movie[i] = "영화 " + (i + 1);
        }

        // 이미지 리소스 ID: mov01 ~ mov83
        final Integer[] posterID = new Integer[83];
        for (int i = 0; i < 83; i++) {
            String name = String.format("mov%02d", i + 1);  // mov01, mov02, ..., mov83
            posterID[i] = getResources().getIdentifier(name, "drawable", getPackageName());
        }

        Spinner spinner = findViewById(R.id.spinner1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, movie);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ImageView ivPoster = findViewById(R.id.ivPoster);
                ivPoster.setImageResource(posterID[position]);
                ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ivPoster.setPadding(10, 10, 10, 10);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // 아무 것도 선택되지 않았을 때
            }
        });
    }
}
