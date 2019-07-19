package com.example.anabi.finalyearproject1try.DesktopProcessorTabActivity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anabi.finalyearproject1try.ProcessorTechnology.ProcessorHyperThreading;
import com.example.anabi.finalyearproject1try.ProcessorTechnology.ProcessorIntegratedGraphics;
import com.example.anabi.finalyearproject1try.ProcessorTechnology.ProcessorOverClock;
import com.example.anabi.finalyearproject1try.ProcessorTechnology.ProcessorPurpose;
import com.example.anabi.finalyearproject1try.ProcessorTechnology.ProcessorSmartCache;
import com.example.anabi.finalyearproject1try.ProcessorTechnology.ProcessorSpecs;
import com.example.anabi.finalyearproject1try.ProcessorTechnology.ProcessorTurboBoost;
import com.example.anabi.finalyearproject1try.ProcessorTechnology.ProcessorVirtualization;
import com.example.anabi.finalyearproject1try.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DesktopProcessorTechTab extends Fragment {

    CardView specs,turboboost,hyperThreading,smartCache,integratedGraphics,overClock,virtualization,purpose;


    public DesktopProcessorTechTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_desktop_processor_tech_tab,container,false);

        specs = (CardView)v.findViewById(R.id.specs);
        turboboost = (CardView)v.findViewById(R.id.turboBoost);
        hyperThreading = (CardView)v.findViewById(R.id.hyperThread);
        smartCache = (CardView)v.findViewById(R.id.cache);
        integratedGraphics = (CardView)v.findViewById(R.id.integratedGpu);
        overClock = (CardView)v.findViewById(R.id.overclock);
        virtualization = (CardView)v.findViewById(R.id.virtualization);
        purpose = (CardView)v.findViewById(R.id.purpose);


        specs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),ProcessorSpecs.class);
                startActivity(intent);

            }
        });



        turboboost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),ProcessorTurboBoost.class);
                startActivity(intent);

            }
        });


        hyperThreading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),ProcessorHyperThreading.class);
                startActivity(intent);

            }
        });


        smartCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),ProcessorSmartCache.class);
                startActivity(intent);

            }
        });


        integratedGraphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),ProcessorIntegratedGraphics.class);
                startActivity(intent);

            }
        });


        overClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),ProcessorOverClock.class);
                startActivity(intent);

            }
        });


        virtualization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),ProcessorVirtualization.class);
                startActivity(intent);

            }
        });


        purpose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),ProcessorPurpose.class);
                startActivity(intent);

            }
        });



        return v;
    }

    public interface OnFragmentInteractionListener {
    }

}
