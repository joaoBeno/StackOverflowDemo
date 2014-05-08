package com.stackoverflow.sodemoapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stackoverflow.sodemoapp.R;

/**
 * Criado por João Beno dia 08/05/2014.
 */
public class FragmentC extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_c,
                container, false);

        return view;
    }
}
