package com.dodream.www.list_0713;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.dodream.www.list_0713.data.person;
import com.dodream.www.list_0713.widget.v_person;

public class a_main extends AppCompatActivity {
    v_person v_person;
    ImageView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);
        cv = (ImageView) findViewById(R.id.CenterView);
        init_data();

    }//onCreate

    private void init_data() {
        Drawable photo = ContextCompat.getDrawable(this, R.drawable.lyk);
        person p = new person("lyk", 25, photo);

        v_person = (v_person) findViewById(R.id.cv_person);
        v_person.setPerson(p);
        v_person.setOnImageClickListener(new com.dodream.www.list_0713.widget.v_person.OnImageClickListener() {
            @Override
            public void onImageClick(v_person _v, person _p) {
                //설정, 비지블
                cv.setImageDrawable(_p.getPhoto());
                cv.setVisibility(View.VISIBLE);
            }
        });
    }
}//class
