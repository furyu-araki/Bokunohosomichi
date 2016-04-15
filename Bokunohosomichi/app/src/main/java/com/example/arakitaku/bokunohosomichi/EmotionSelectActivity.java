package com.example.arakitaku.bokunohosomichi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * 画像選択画面
 */
public class EmotionSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion_select);
    }

    public void b0(View v) {
        ((TextView) findViewById(R.id.top_text)).setText("ほげ");
    }
}
