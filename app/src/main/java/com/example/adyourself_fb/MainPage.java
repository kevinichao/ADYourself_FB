package com.example.adyourself_fb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class MainPage extends AppCompatActivity {

    private TextView showuser;
    private String usernow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        //接收登入or註冊頁面傳來的使用者資訊
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            usernow = bundle.getString("nowuser");
        }

        //左上角顯示現在使用者
        showuser =(TextView) findViewById(R.id.text_showuser);
        showuser.setText("歡迎使用ADYourSelf，"+usernow+"。");

    }
}
