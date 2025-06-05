package boongtol.BOONGTOL_MBP;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class gik_2_3 extends AppCompatActivity {

    Button btnNate, btn911, btnGal, btnEnd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gik_2_3);

        btnNate = (Button) findViewById(R.id.btnNate);
        btn911 = (Button) findViewById(R.id.btn911);
        btnGal = (Button) findViewById(R.id.btnGal);
        btnEnd = (Button) findViewById(R.id.btnEnd);

        btnNate.setBackgroundColor(Color.GRAY);
        btn911.setBackgroundColor(Color.GREEN);
        btnGal.setBackgroundColor(Color.RED);
        btnEnd.setBackgroundColor(Color.YELLOW);

        btnNate.setTextColor(Color.BLACK);
        btn911.setTextColor(Color.BLACK);
        btnGal.setTextColor(Color.BLACK);
        btnEnd.setTextColor(Color.BLACK);

        btnNate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri
                        .parse("http://m.nate.com"));       // Intent.ACTION_VIEW--> "무언가(URI 등)를 보고 싶다"**는 의도를 안드로이드 시스템에 전달하는 상수야.


                startActivity(mIntent);

            }
        });

        btn911.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri
                        .parse("tel:/911"));
                startActivity(mIntent);

            }
        });

        btnGal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri
                        .parse("content://media/internal/images/media"));
                startActivity(mIntent);

            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();

            }
        });
    }
}

// view v 라는 매개변수의 역할의 이해는 자바 이벤트 처리 후에 복습한다. 지금은 무리! 지금은 큰그림만 이해하고 넘어간다!