package com.myteam.myteam;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Rgee on 30/09/2017.
 */

public class rgee_fragment extends Fragment
{
    private static final String Tag = "Rgee";
    private Button btnRgee;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rgee_fragment,container,false);



        return view;

    }

    public String get_Tag()
    {
        return this.Tag;
    }



}
