package com.dodream.www.list_0713;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dodream.www.list_0713.data.Actor;
import com.dodream.www.list_0713.data.Comment;
import com.dodream.www.list_0713.data.Drama;
import com.dodream.www.list_0713.data.Movie;

public class a_actor extends AppCompatActivity {

    ListView lv;
    ada_actor ada_actor;
    Actor actor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_actor);
        lv = (ListView) findViewById(R.id.aa_lv);
        ada_actor = new ada_actor();
        lv.setAdapter(ada_actor);
        init_data();
    }//Create

    private void init_data() {
        actor = new Actor();
        actor.photo = ContextCompat.getDrawable(this, R.drawable.lyk);
        actor.name = "이영균";
        actor.age = 25;
        actor.desc = "Desc....";

        Movie movie = new Movie();
        movie.Picture = ContextCompat.getDrawable(this, R.drawable.lyk);
        movie.title = "title..1";
        movie.year = "1992";
        actor.movies.add(movie);

        movie = new Movie();
        movie.Picture = ContextCompat.getDrawable(this, R.drawable.lyk);
        movie.title = "title..2";
        movie.year = "1993";
        actor.movies.add(movie);

        movie = new Movie();
        movie.Picture = ContextCompat.getDrawable(this, R.drawable.lyk);
        movie.title = "title..3";
        movie.year = "1994";
        actor.movies.add(movie);

        Drama drama = new Drama();
        drama.picture = ContextCompat.getDrawable(this, R.drawable.lyk);
        drama.name = "name..1";
        drama.age = "1992";
        actor.dramas.add(drama);

        drama = new Drama();
        drama.picture = ContextCompat.getDrawable(this, R.drawable.lyk);
        drama.name = "name..2";
        drama.age = "1993";
        actor.dramas.add(drama);

        drama = new Drama();
        drama.picture = ContextCompat.getDrawable(this, R.drawable.lyk);
        drama.name = "name..3";
        drama.age = "1994";
        actor.dramas.add(drama);

        Comment comment = new Comment();
        comment.comment = "comm...1";
        comment.writer = "이영균";
        actor.comment.add(comment);

        ada_actor.setActor(actor);
    }
}










