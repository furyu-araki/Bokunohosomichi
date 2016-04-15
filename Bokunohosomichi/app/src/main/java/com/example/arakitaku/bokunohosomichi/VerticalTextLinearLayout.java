package com.example.arakitaku.bokunohosomichi;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * テキストを縦書き表示するカスタムビュー
 */
public class VerticalTextLinearLayout extends LinearLayout {
    public VerticalTextLinearLayout(Context context) {
        this(context, null);
    }

    public VerticalTextLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VerticalTextLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(VERTICAL);
    }

    public void setText(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            TextView textView = new TextView(getContext());
            textView.setText(chars, i, 1);
            addView(textView);
        }
    }

}
