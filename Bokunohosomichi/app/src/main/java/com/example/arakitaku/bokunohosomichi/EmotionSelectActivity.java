package com.example.arakitaku.bokunohosomichi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * 画像選択画面
 */
public class EmotionSelectActivity extends AppCompatActivity {

    protected void SetResult(EmotionSelectResult.Emotion emotion)
    {
        EmotionSelectResult emotionSelectResult = EmotionSelectResult.GetInstance();
        emotionSelectResult.Set( emotion );
    }
    protected void GoNextIntent()
    {
        startActivity(new Intent(EmotionSelectActivity.this, ResultDisplayActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion_select);
    }

    public void b1(View v) {
        SetResult( EmotionSelectResult.Emotion.Presure );
        GoNextIntent();
    }

    public void b2(View v) {
        SetResult( EmotionSelectResult.Emotion.Anger );
        GoNextIntent();
    }

    public void b3(View v) {
        SetResult( EmotionSelectResult.Emotion.Sad );
        GoNextIntent();
    }

    public void b4(View v) {
        SetResult( EmotionSelectResult.Emotion.Fun );
        GoNextIntent();
    }
}
