package com.dodream.www.list_0713.widget;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.dodream.www.list_0713.R;

/**
 * Created by Tacademy on 2016-07-15.
 */
public class v_Actor extends FrameLayout {

    ImageView photo;
    TextView name, age, desc;

    public v_Actor(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.v_actor, this);
        photo = (ImageView) findViewById(R.id.va_photo);
        name = (TextView) findViewById(R.id.va_name);
        age = (TextView) findViewById(R.id.va_age);
        desc = (TextView) findViewById(R.id.va_desc);
    }

    private void setActor(String _name, String _age, String _desc) {
        photo.setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.lyk));
        name.setText(_name);
        age.setText(_age);
        desc.setText(_desc);
    }

}
