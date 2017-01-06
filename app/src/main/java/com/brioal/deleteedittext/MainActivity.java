package com.brioal.deleteedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;

import com.brioal.deview.DEFocuChangeListener;
import com.brioal.deview.DETextChangeListener;
import com.brioal.deview.DEView;

public class MainActivity extends AppCompatActivity {
    private DEView mDEView1, mDEView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDEView1 = (DEView) findViewById(R.id.main_et1);
        mDEView2 = (DEView) findViewById(R.id.main_et2);

        mDEView2.setOnFocusChangeListener(new DEFocuChangeListener(mDEView2) {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                super.onFocusChange(v, hasFocus);
                System.out.println("焦点状态:" + hasFocus);
            }
        });
        mDEView2.addTextChangedListener(new DETextChangeListener(mDEView2) {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                super.onTextChanged(s, start, before, count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                super.afterTextChanged(s);
                System.out.println("当前的内容是:" + s.toString());
            }
        });
    }

    public void showError(View view) {
        mDEView1.setError("出错了");
        mDEView2.setError("出错了");
    }
}
