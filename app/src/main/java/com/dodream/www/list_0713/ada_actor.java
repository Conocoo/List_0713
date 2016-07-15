package com.dodream.www.list_0713;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dodream.www.list_0713.data.Actor;

/**
 * Created by Tacademy on 2016-07-15.
 */
public class ada_actor extends BaseAdapter {
    Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }


}
