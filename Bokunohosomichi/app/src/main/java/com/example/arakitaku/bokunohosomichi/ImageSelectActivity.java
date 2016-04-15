package com.example.arakitaku.bokunohosomichi;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import java.io.InputStream;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.io.File;
import android.media.ExifInterface;
import android.database.Cursor;
import android.provider.MediaStore;


/**
 * 画像選択画面
 */
public class ImageSelectActivity extends AppCompatActivity {

    private static final int REQUEST_GALLERY = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_select);

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, REQUEST_GALLERY);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_GALLERY && resultCode == RESULT_OK) {
            try {
                //画像をここで取る場合はInputStreamでいける
                //InputStream in = getContentResolver().openInputStream(data.getData());

                //画像パスを取得する
                Uri resultUrl = (data != null ? data.getData() : null);
                if( resultUrl != null ) {

                    ImageSelectResult.getInstance().SetFileUrl(resultUrl);

                    Log.d( getLocalClassName(), ImageSelectResult.getInstance().GetFileUrl().getPath());
//                    ExifInterface exifInterface = new ExifInterface(ImageSelectResult.getInstance().GetFileUrl().getPath());
//                    String dateTime = exifInterface.getAttribute(exifInterface.TAG_DATETIME);
//                    Log.d( getLocalClassName(), dateTime);

//                    String[] columns = {MediaStore.Images.Media.DATA };
//                    Cursor c = getContentResolver().query(data.getData(), columns, null, null, null);
//                    c.moveToFirst();
//
//                    ExifInterface exifInterface = new ExifInterface(c.getString(0));
//                    String dateTime = exifInterface.getAttribute(exifInterface.TAG_DATETIME);
//
//                    Log.d(getLocalClassName(), dateTime);

                    //遷移
                    Intent intent = new Intent(ImageSelectActivity.this, EmotionSelectActivity.class);
                    startActivity(intent);
                }

            } catch (Exception e) {

            }
        }
    }
}

