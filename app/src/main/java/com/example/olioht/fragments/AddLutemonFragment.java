package com.example.olioht.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.olioht.R;
import com.example.olioht.Storage;
import com.example.olioht.LutemonColors.Pink;
import com.google.android.material.textfield.TextInputEditText;

public class AddLutemonFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_lutemon, container, false);

        TextInputEditText LutemonName = view.findViewById(R.id.LutemonNameInput);

        RadioGroup ColorRadioGroup = view.findViewById(R.id.ColorRadioGroup);

        int currentID = ColorRadioGroup.getCheckedRadioButtonId();

        if (LutemonName.getText().toString() != null || LutemonName.getText().toString() != "") {
            if (currentID == R.id.radioButtonPink) {
                Storage.getInstance().addLutemon(new Pink((LutemonName.getText().toString())));
            } else if (currentID == R.id.radioButtonBlack) {
                Storage.getInstance().addLutemon(new Black((LutemonName.getText().toString())));
            } else if (currentID == R.id.radioButtonGreen) {
                Storage.getInstance().addLutemon(new Pink((LutemonName.getText().toString())));
            } else if (currentID == R.id.radioButtonWhite) {
                Storage.getInstance().addLutemon(new Pink((LutemonName.getText().toString())));
            } else if (currentID == R.id.radioButtonOrange) {
                Storage.getInstance().addLutemon(new Pink((LutemonName.getText().toString())));
            }
        } else {
            // TODO add warning no lutemon name given
        }

        /*
        switch (ColorRadioGroup.getCheckedRadioButtonId()) {
            case R.id.radioButtonPink:
                if (LutemonName.getText() != null) {
                    
                    Storage.getInstance().addLutemon(new Pink((LutemonName.getText().toString())));
                }
                break;

        }
        */
        // Inflate the layout for this fragment
        return view;
    }

    public void addLutemon(View view) {
        RadioGroup ColorRadioGroup = view.findViewById(R.id.ColorRadioGroup);

    }

}