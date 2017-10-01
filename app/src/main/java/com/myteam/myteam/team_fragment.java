package com.myteam.myteam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Rgee on 30/09/2017.
 */

public class team_fragment extends Fragment
{
    private static final String Tag = "Team";
    private Button btnTeam;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.team_fragment,container,false);

        btnTeam = (Button) view.findViewById(R.id.team_button);

        btnTeam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getActivity(), "Team", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }

    public String get_Tag()
    {
        return this.Tag;
    }
}
