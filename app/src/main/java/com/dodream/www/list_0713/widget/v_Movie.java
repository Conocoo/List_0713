package com.dodream.www.list_0713.widget;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.dodream.www.list_0713.R;

public class v_Movie extends FrameLayout {

    ImageView picture;
    TextView title, year;

    public v_Movie(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.v_movie, this);
        picture = (ImageView) findViewById(R.id.vm_photo);
        title = (TextView) findViewById(R.id.vm_title);
        year = (TextView) findViewById(R.id.vm_year);
    }

    public void setMovie(String _title, String _year) {
        picture.setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.lyk));
        title.setText(_title);
        year.setText(_year);
    }
}