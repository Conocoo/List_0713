package com.dodream.www.list_0713.widget;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.dodream.www.list_0713.R;
import com.dodream.www.list_0713.data.RecevieData;

public class v_Recevie extends FrameLayout {

    TextView messageView;
    ImageView photoView;
    RecevieData data;

    public v_Recevie(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.v_recevie, this);
        messageView = (TextView) findViewById(R.id.text_message);
        photoView = (ImageView) findViewById(R.id.image_photo);
    }

    public void setData(RecevieData data) {
        this.data = data;
        messageView.setText(data.getMessage());
        photoView.setImageDrawable(data.getPhoto());
    }

}
