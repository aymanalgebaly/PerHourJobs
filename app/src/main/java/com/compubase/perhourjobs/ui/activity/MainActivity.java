package com.compubase.perhourjobs.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.compubase.perhourjobs.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.lin_faceBook)
    LinearLayout linFaceBook;
    @BindView(R.id.lin_signUp)
    LinearLayout linSignUp;
    @BindView(R.id.sign_in_txt)
    TextView signInTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.lin_faceBook, R.id.lin_signUp, R.id.sign_in_txt})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lin_faceBook:
                break;
            case R.id.lin_signUp:
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
                break;
            case R.id.sign_in_txt:
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                break;
        }
    }
}
