package com.example.anabi.finalyearproject1try.DesktopMouseActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anabi.finalyearproject1try.R;


public class DesktopMouseTechTab extends Fragment {


    public DesktopMouseTechTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_desktop_mouse_tech_tab, container, false);
    }

    public interface OnFragmentInteractionListener {
    }



}
