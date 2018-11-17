package com.example.along.learningprogram;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * @author $汪金龙$
 * @desc
 * @date 2018/10/18 14:26
 */
public class ListAdapter extends BaseQuickAdapter<ListEntity, BaseViewHolder> {
    public ListAdapter(int layoutResId, @Nullable List<ListEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ListEntity item) {
        helper.setText(R.id.item_list_tv_content,item.getContent());
        helper.setImageResource(R.id.item_list_iv_icon,item.getIcon());
    }
}
