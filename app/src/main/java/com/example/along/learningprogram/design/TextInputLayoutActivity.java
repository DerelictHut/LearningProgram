package com.example.along.learningprogram.design;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.utils.SoftInputUtil;
import com.example.l.commoncomponent.utils.WindowUtils;
import com.example.lon.baselibary.BaseActivity;


import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc TextInputLayout
 * @date 2018/10/26 11:31
 */
public class TextInputLayoutActivity extends BaseActivity {
    /**
     * 错误信息提示
     */
    @BindView(R2.id.til_error)
    TextInputLayout mTilError;
    /**
     * 错误信息提示
     */
    @BindView(R2.id.tiet_error)
    TextInputEditText mTietError;
    /**
     * 带图片
     */
    @BindView(R2.id.tiet_icon)
    TextInputEditText mTietIcon;

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {
        mTietError.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > mTilError.getCounterMaxLength() || s.length() < 6) {
                    mTilError.setError(getString(R.string.et_error_text));
                } else {
                    mTilError.setError(null);
                }
            }
        });
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.edit_lock);
        if (drawable != null) {
            drawable.setBounds(0, 0, WindowUtils.INSTANCE.dp2px(this, 14), WindowUtils.INSTANCE.dp2px(this, 14));
            mTietIcon.setCompoundDrawables(drawable, null, null, null);
        }
    }

    @Override
    protected void request() {

    }

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.materialdesign_activity_text_input_layout;
    }

    public void onCloseKeyboard(View v) {
        SoftInputUtil.INSTANCE.hideSoftInput(this, v);
    }
}
