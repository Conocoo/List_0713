package com.dodream.www.list_0713.data;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    public Drawable photo;
    public String name;
    public int age;
    public String desc;
    public List<Movie> movies =new ArrayList<>();
    public List<Drama> dramas= new ArrayList<>();
    public List<Comment> comment = new ArrayList<>();
}
