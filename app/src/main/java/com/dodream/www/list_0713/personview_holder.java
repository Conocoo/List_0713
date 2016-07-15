package com.dodream.www.list_0713;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dodream.www.list_0713.data.person;


public class personview_holder extends RecyclerView.ViewHolder {
    ImageView pv;
    TextView name, age;
    person person;

    public personview_holder(View itemView) {
        super(itemView);
        pv = (ImageView) itemView.findViewById(R.id.rv_photo);
        name = (TextView) itemView.findViewById(R.id.rv_name);
        age = (TextView) itemView.findViewById(R.id.rv_age);

    }//con

    public void setPerson(person _p) {
        person = _p;
        pv.setImageDrawable(person.getPhoto());
        name.setText(person.getName());
        age.setText("" + person.getAge());
    }

}//class
