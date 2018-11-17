package com.example.along.learningprogram.animation;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 矢量图
 * @date 2018/10/30 10:42
 */
public class VectorDrawableActivity extends BaseActivity {
    @BindView(R2.id.iv_two)
    ImageView mIvTwo;
    @BindView(R2.id.iv_three)
    ImageView mIvThree;
    private boolean mExpanded = false;

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void request() {

    }

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.animation_activity_vector_drawable;
    }

    public void onIvTwo(View view) {
        Drawable drawable = mIvTwo.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (!animatable.isRunning()) {
                animatable.start();
            }
        }
    }

    public void onIvThree(View view) {
        if (!mExpanded) {
            AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) getDrawable(R.drawable.animation_vector_target_demo_three);
            mIvThree.setImageDrawable(drawable);
            if (drawable != null) {
                drawable.start();
            }
        } else {
            AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) getDrawable(R.drawable.animation_vector_target_demo_four);
            mIvThree.setImageDrawable(drawable);
            if (drawable != null) {
                drawable.start();
            }
        }
        mExpanded = !mExpanded;
    }
}
