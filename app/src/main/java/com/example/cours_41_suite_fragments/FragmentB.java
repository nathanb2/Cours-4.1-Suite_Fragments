package com.example.cours_41_suite_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Locale;

public class FragmentB extends Fragment {

    public static final String TAG = FragmentB.class.getSimpleName();
    private static final String COUNTER_KEY = "COUNTER_KEY";

    public static FragmentB newInstance(int counter){
        FragmentB fragmentB = new FragmentB();
        Bundle bundle = new Bundle();
        bundle.putInt(COUNTER_KEY, counter);
        fragmentB.setArguments(bundle);
        return fragmentB;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null && getArguments().containsKey(COUNTER_KEY)){
            TextView textView = view.findViewById(R.id.FB_tv);
            textView.setText(String.format(Locale.getDefault(), "%s numero %d", textView.getText(), getArguments().getInt(COUNTER_KEY)));
        }
    }
}
