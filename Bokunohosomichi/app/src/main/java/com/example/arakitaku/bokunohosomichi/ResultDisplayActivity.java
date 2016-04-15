package com.example.arakitaku.bokunohosomichi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 画像選択画面
 */
public class ResultDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_display);

        VerticalTextLinearLayout verticalText1 = (VerticalTextLinearLayout) findViewById(R.id.result_display_vertical_text1);
        verticalText1.setText("あいうえお");

        VerticalTextLinearLayout verticalText2 = (VerticalTextLinearLayout) findViewById(R.id.result_display_vertical_text2);
        verticalText2.setText("かきくせこさし");

        VerticalTextLinearLayout verticalText3 = (VerticalTextLinearLayout) findViewById(R.id.result_display_vertical_text3);
        verticalText3.setText("すせそたち");

    }
}
