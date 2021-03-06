package com.andy.myproject_007.ui.adapter.base;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

import java.util.HashMap;

public abstract class BaseCheckedHolder<T> extends BaseInfoViewHolder{

	protected CheckBox mCheckBox;
	protected int checkedResId;

	public BaseCheckedHolder(int checkedResId) {
		this.checkedResId = checkedResId;
	}

	public void initView(View view) {
		mCheckBox = (CheckBox) view.findViewById(checkedResId);
	}

	@Override
	public void initData(Context context, Object o, int position) {}

	public abstract void initData(Context context, T t, int position, BaseCheckedAdapter<T>.CheckedBean checked);

}
