package com.example.arakitaku.bokunohosomichi;

/**
 * Created by umama on 2016/04/15.
 */
public class EmotionSelectResult {

    public enum Emotion {
        Presure(1),
        Anger(2),
        Sad(3),
        Fun(4);

        private final int id;

        private Emotion(final int id) {
            this.id = id;
        }
    }

    private static EmotionSelectResult emotionSelectResult;
    private Emotion emotion_ = Emotion.Presure;

    private EmotionSelectResult(){}

    public static EmotionSelectResult GetInstance()
    {
        if ( emotionSelectResult == null )
        {
            emotionSelectResult = new EmotionSelectResult();
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
