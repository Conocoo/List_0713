package com.dodream.www.list_0713;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dodream.www.list_0713.data.person;

import java.util.ArrayList;
import java.util.List;


public class ada_recycle extends RecyclerView.Adapter<personview_holder> {
    List<person> items = new ArrayList<>();

    public void add(person _p) {
        items.add(_p);
        notifyDataSetChanged();
    }

    @Override
    public personview_holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.v_recevie, parent, false);
        return new personview_holder(view);
    }

    @Override
    public void onBindViewHolder(personview_holder holder, int position) {
        holder.setPerson(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
