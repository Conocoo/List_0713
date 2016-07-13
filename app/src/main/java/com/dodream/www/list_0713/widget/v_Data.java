package com.dodream.www.list_0713.widget;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dodream.www.list_0713.R;
import com.dodream.www.list_0713.data.DateData;

public class v_Data extends FrameLayout {
    TextView messageView;
    DateData data;

    public v_Data(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.v_date, this);
        messageView = (TextView) findViewById(R.id.text_message);
    }

    public void setData(DateData data) {
        this.data = data;
        messageView.setText(data.getMessage());
    }
}
