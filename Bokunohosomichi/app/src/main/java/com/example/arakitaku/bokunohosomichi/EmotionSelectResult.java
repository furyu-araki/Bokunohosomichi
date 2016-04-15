package com.example.arakitaku.bokunohosomichi;

/**
 * Created by umama on 2016/04/15.
 */
public class EmotionSelectResult {

    public enum Emotion
    {
        Presure,
        Anger,
        Sad,
        Fun
    }

    private static EmotionSelectResult emotionSelectResult;
    private Emotion emotion_ = Emotion.Presure;

    private EmotionSelectResult(){}

    public EmotionSelectResult GetInstance()
    {
        if ( emotionSelectResult == null )
        {
            emotionSelectResult = new EmotionSelectResult;
        }
        return emotionSelectResult;
    }

    public void Set( Emotion emotion )
    {
        emotion_ = emotion;
    }

    public Emotion Get()
    {
        return emotion_;
    }
}
