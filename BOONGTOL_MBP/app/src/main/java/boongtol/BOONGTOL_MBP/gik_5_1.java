package boongtol.BOONGTOL_MBP;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class gik_5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gik_5_1);
    }
}

// AppCompatActivity는 우리가 만든 화면(Activity)을 도와주는 ‘부모 클래스’
// → 화면 UI, 액션바, 생명주기 등 기능을 쉽게 쓸 수 있게 도와주는 뼈대 클래스야.

//  AppCompatActivity의 onCreate() 메소드는 기본 준비만 해줄 뿐,
// 네가 직접 onCreate() 오버라이딩해서 화면을 연결해줘야 앱이 눈에 보인다!

// onCreate()는 회전하면 똑같은 코드가 다시 실행되지만, 완전 새로 시작하는 상태라서 입력값이나 상태는 날아가 있어!

// savedInstanceState는 너만 쓰는 게 아니고,
// 부모 클래스(AppCompatActivity)도 시스템 상태를 복원하려고 같이 쓰기 때문에
// super.onCreate(savedInstanceState)로 꼭 넘겨줘야 해!
// 새 액티비티란 같은 액티비티 클래스가 새롭게 인스턴스화 된 거야!

// 회전 전후로 화면에 표시되는 전체 집합은 달라도,
// 그걸 만드는 기반 클래스는 동일하게 작동한다!

// 해결책: savedInstanceState로 데이터 복원하고, 필요하면 가로 모드용 레이아웃을 따로 만들어서 "전체집합"의 변화를 자연스럽게 관리할 수 있어.