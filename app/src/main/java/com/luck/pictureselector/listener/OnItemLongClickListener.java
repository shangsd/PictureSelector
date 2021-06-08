package com.luck.pictureselector.listener;

import android.view.View;

import android.support.v7.widget.RecyclerView;

/**
 * @author：luck
 * @date：2020-01-13 17:58
 * @describe：长按事件
 */
public interface OnItemLongClickListener {
    void onItemLongClick(RecyclerView.ViewHolder holder, int position, View v);
}
