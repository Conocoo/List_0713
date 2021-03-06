package com.dodream.www.list_0713.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.dodream.www.list_0713.R;
import com.dodream.www.list_0713.data.person;

public class v_person extends FrameLayout {
    ImageView iv_person;
    TextView tv_name, tv_age;
    person person;

    public v_person(Context context) {
        this(context, null);
    }

    public v_person(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init() {
        inflate(getContext(), R.layout.v_person, this);
        iv_person = (ImageView) findViewById(R.id.rv_photo);
        tv_name = (TextView) findViewById(R.id.rv_name);
        tv_age = (TextView) findViewById(R.id.tv_age);

        iv_person.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                    mListener.onImageClick(v_person.this, person);
                }
            }
        });
    }

    public void setPerson(person _p) {
        person = _p;
        iv_person.setImageDrawable(person.getPhoto());
        tv_name.setText(person.getName());
        tv_age.setText("" + person.getAge());
    }

    public void setOnImageClickListener() {

    }

    public interface OnImageClickListener {
        void onImageClick(v_person _v, person _p);
    }

    OnImageClickListener mListener;
    public void setOnImageClickListener(OnImageClickListener listener){
        mListener=listener;
    }

}