package com.dodream.www.list_0713.widget;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dodream.www.list_0713.R;

/**
 * Created by Tacademy on 2016-07-15.
 */
public class v_Comment extends FrameLayout {

    TextView comment, writer;

    public v_Comment(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.v_comment, this);
        comment = (TextView) findViewById(R.id.vc_comment);
        writer = (TextView) findViewById(R.id.vc_writer);
    }

    public void setComment(String _comment, String _writer) {
        comment.setText(_comment);
        writer.setText(_writer);
    }
}
