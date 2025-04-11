package com.example.olioht;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.olioht.fragments.HomeFragment;
import com.example.olioht.fragments.MoveLutemonFragment;
import com.google.android.material.tabs.TabItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TabItem HomeFragment = findViewById(R.id.HomeButton);
        TabItem MoveFragment = findViewById(R.id.MoveButton);
        TabItem TrainFragment = findViewById(R.id.TrainButton);
        TabItem BattleFragment = findViewById(R.id.BattleButton);
        TabItem AddFragment = findViewById(R.id.AddButton);
        TabItem StorageFragment = findViewById(R.id.StorageButton);
        HomeFragment.setOnClickListener(listener);
        MoveFragment.setOnClickListener(listener);
        TrainFragment.setOnClickListener(listener);
        BattleFragment.setOnClickListener(listener);
        AddFragment.setOnClickListener(listener);
        StorageFragment.setOnClickListener(listener);


    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = null;

            int id = view.getId();
            if (id == R.id.HomeButton){
                fragment = new HomeFragment();
            } else if (id== R.id.StorageButton){
                fragment = new MoveLutemonFragment();
            } else if (id== R.id.BattleButton) {
                    fragment = new MoveLutemonFragment();
            } else if (id== R.id.TrainButton) {
                fragment = new MoveLutemonFragment();
            } else if (id== R.id.AddButton){
                fragment = new MoveLutemonFragment();
            }
            if (fragment !=null){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.MainFragmentView, fragment)
                        .commit();

            }
        }
    };
}


