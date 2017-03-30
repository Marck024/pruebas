package com.example.root.pruebas;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento extends Fragment {


    public Fragmento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_main,container,false);

        RelativeLayout.LayoutParams parametros= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        parametros.addRule(RelativeLayout.BELOW, R.id.button);

        parametros.setMargins(0,50,0,0);
        v.setLayoutParams(parametros);

        Button tb=(Button) v.findViewById(R.id.button);
        tb.setText("un frag con nuevo boton");
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"fragmento",Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}
