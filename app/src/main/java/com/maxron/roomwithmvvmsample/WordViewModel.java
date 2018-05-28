package com.maxron.roomwithmvvmsample;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by maxron on 2018/5/28.
 */

public class WordViewModel extends AndroidViewModel {

    private WordRepository mWordRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mWordRepository = new WordRepositoryImpl(application);
        mAllWords = mWordRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word) {
        mWordRepository.insert(word);
    }
}
