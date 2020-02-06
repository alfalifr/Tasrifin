package com.ainlab.tasrifin.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ainlab.tasrifin.BelajarArabActivity;
import com.ainlab.tasrifin.R;
import com.ainlab.tasrifin.TesBacaActivity;

public class DashboardFragment extends Fragment{

    private DashboardViewModel dashboardViewModel;

    Button btnTesBaca;
    Button btnBelajarArab;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        /**
        final TextView textView = root.findViewById(R.id.text_dashboard);
        dashboardViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
         **/


        btnTesBaca = root.findViewById(R.id.btnTesBaca);
        btnBelajarArab = root.findViewById(R.id.btnBelajarArab);

        btnTesBaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), TesBacaActivity.class);
                startActivity(intent);
            }
        });

        btnBelajarArab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BelajarArabActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}