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
public class v_Drama extends FrameLayout {

    ImageView picture;
    TextView title, year;

    public v_Drama(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.v_drama, this);
        picture = (ImageView) findViewById(R.id.vd_photo);
        title = (TextView) findViewById(R.id.vd_title);
        year = (TextView) findViewById(R.id.vd_year);
    }
    public void setDrama(String _title, String _year) {
        picture.setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.lyk));
        title.setText(_title);
        year.setText(_year);
    }

}
