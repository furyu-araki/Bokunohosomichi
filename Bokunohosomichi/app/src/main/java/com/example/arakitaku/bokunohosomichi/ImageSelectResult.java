package com.example.arakitaku.bokunohosomichi;

import android.net.Uri;
import android.util.Log;

/**
 * Created by arcueid on 16/04/15.
 */
public class ImageSelectResult {
    private static ImageSelectResult singleton = new ImageSelectResult();

    Uri mResultFilePath;

    private ImageSelectResult(){
    }

    public static ImageSelectResult getInstance(){
        return singleton;
    }

    public void SetFileUrl( Uri resultFilePath )
    {
        mResultFilePath = resultFilePath;
    }

    public Uri GetFileUrl()
    {
        return mResultFilePath;
    }
}
