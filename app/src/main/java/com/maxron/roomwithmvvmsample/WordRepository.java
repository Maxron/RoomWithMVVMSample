package com.maxron.roomwithmvvmsample;

import android.arch.lifecycle.LiveData;

import java.util.List;

/**
 * Created by maxron on 2018/5/28.
 */

public interface WordRepository {

    void insert(Word word);

    LiveData<List<Word>> getAllWords();
}
