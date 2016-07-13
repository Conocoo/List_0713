package com.dodream.www.list_0713.widget;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.dodream.www.list_0713.R;
import com.dodream.www.list_0713.data.SendData;

public class v_Send extends FrameLayout {
    public v_Send(Context context) {
        super(context);
        init();
    }

    TextView messageView;
    ImageView photoView;

    private void init() {
        inflate(getContext(), R.layout.v_send, this);
        messageView = (TextView)findViewById(R.id.text_message);
        photoView = (ImageView)findViewById(R.id.image_photo);
    }

    SendData data;
    public void setData(SendData data) {
        this.data = data;
        messageView.setText(data.getMessage());
        photoView.setImageDrawable(data.getPhoto());
    }

}
