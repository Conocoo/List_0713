package com.dodream.www.list_0713;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dodream.www.list_0713.data.person;
import com.dodream.www.list_0713.widget.v_person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-07-13.
 */
public class ada_custom extends BaseAdapter {
    List<person> list = new ArrayList<>();

    public void add(person p) {
        list.add(p);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        v_person v;
        if (view == null) {
            v = new v_person(viewGroup.getContext());
        } else {
            v = (v_person) view;
        }
        v.setPerson(list.get(i));
        return v;
    }
}
