package com.dodream.www.list_0713;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dodream.www.list_0713.data.ChattingData;
import com.dodream.www.list_0713.data.DateData;
import com.dodream.www.list_0713.data.RecevieData;
import com.dodream.www.list_0713.data.SendData;
import com.dodream.www.list_0713.widget.v_Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-07-13.
 */
public class ada_multi extends BaseAdapter {
    private static final int VIEW_TYPE_COUNT = 3;
    private static final int VIEW_INDEX_SEND = 0;
    private static final int VIEW_INDEX_RECEIVE = 1;
    private static final int VIEW_INDEX_DATE = 2;
    List<ChattingData> list = new ArrayList<>();

    public void add(ChattingData c) {
        list.add(c);
        notifyDataSetChanged();
    }//add

    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        ChattingData cD = list.get(position);
        if (cD instanceof SendData) {
            return VIEW_INDEX_SEND;
        } else if (cD instanceof RecevieData) {
            return VIEW_INDEX_RECEIVE;
        } else {
            return VIEW_INDEX_DATE;
        }
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
        switch (getItemViewType(i)) {
            case VIEW_INDEX_DATE:
                v_Data DD;
                if (view == null || !(view instanceof v_Data)) {
                    DD = new v_Data(viewGroup.getContext());
                } else {
                    DD = (v_Data) view;
                }
                DD.setData((DateData) list.get(i));
                return DD;
            case VIEW_INDEX_RECEIVE:

            case VIEW_INDEX_SEND:
            default:
        }
        return null;
    }
}
