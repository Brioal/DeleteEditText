package com.brioal.deview;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * email :brioal@foxmail.com
 * github : https://github.com/Brioal
 * Created by brioal on 17-1-6.
 */

public class DETextChangeListener implements TextWatcher {
    private DEView mDEView;

    public DETextChangeListener(DEView DEView) {
        mDEView = DEView;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        String text = s.toString();
        if (text.isEmpty()) {
            mDEView.hideDelete();
        } else {
            mDEView.showDelete();
        }
    }
}
