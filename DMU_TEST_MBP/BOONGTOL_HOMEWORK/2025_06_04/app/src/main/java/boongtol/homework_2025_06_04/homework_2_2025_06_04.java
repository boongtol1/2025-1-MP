package boongtol.homework_2025_06_04;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class homework_2_2025_06_04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_2_2025_06_04);
        setTitle("갤러리 영화 포스터(개선)");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        Gallery gallery = findViewById(R.id.gallery1);
        MyGalleryAdapter galAdapter = new MyGalleryAdapter(this);
        gallery.setAdapter(galAdapter);
    }

    public class MyGalleryAdapter extends BaseAdapter {
        Context context;

        // mov01 ~ mov83 이미지 리소스 ID
        Integer[] posterID = new Integer[83];
        String[] posterTitle = new String[83];

        public MyGalleryAdapter(Context c) {
            context = c;

            // 이미지 ID 자동 생성
            for (int i = 0; i < 83; i++) {
                String name = String.format("mov%02d", i + 1); // mov01, mov02, ..., mov83
                posterID[i] = getResources().getIdentifier(name, "drawable", getPackageName());
                posterTitle[i] = "영화 " + (i + 1);
            }
        }

        public int getCount() {
            return posterID.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new Gallery.LayoutParams(200, 300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);
            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnTouchListener((v, event) -> {
                ImageView ivPoster = findViewById(R.id.ivPoster);
                ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ivPoster.setImageResource(posterID[pos]);

                Toast toast = new Toast(getApplicationContext());
                View toastView = View.inflate(getApplicationContext(), R.layout.toast, null);
                TextView toastText = toastView.findViewById(R.id.textView1);
                toastText.setText(posterTitle[pos]);
                toast.setView(toastView);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();

                return false;
            });

            return imageview;
        }
    }
}
