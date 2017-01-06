package com.brioal.deview;

import android.view.View;

/**
 * email :brioal@foxmail.com
 * github : https://github.com/Brioal
 * Created by brioal on 17-1-6.
 */

public class DEFocuChangeListener implements View.OnFocusChangeListener {
    private DEView mDEView;

    public DEFocuChangeListener(DEView DEView) {
        mDEView = DEView;
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus) {
            if (!mDEView.getText().toString().isEmpty()) {
                mDEView.showDelete();
            } else {
                mDEView.hideDelete();
            }
        } else {
            mDEView.hideDelete();
        }
    }
}
