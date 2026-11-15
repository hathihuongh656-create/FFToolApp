package com.fftool.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Switch switchAimbot;
    private Switch switchWallhack;
    private Switch switchSpeedHack;
    private Switch switchAntiBan;
    private Switch switchNoRecoil;
    private Button btnActivate;
    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchAimbot   = findViewById(R.id.switch_aimbot);
        switchWallhack = findViewById(R.id.switch_wallhack);
        switchSpeedHack= findViewById(R.id.switch_speedhack);
        switchAntiBan  = findViewById(R.id.switch_antiban);
        switchNoRecoil = findViewById(R.id.switch_norecoil);
        btnActivate    = findViewById(R.id.btn_activate);
        tvStatus       = findViewById(R.id.tv_status);

        btnActivate.setOnClickListener(v -> activateFeatures());
    }

    private void activateFeatures() {
        StringBuilder sb = new StringBuilder();
        sb.append("Status:\n");
        sb.append("Aimbot: ").append(switchAimbot.isChecked() ? "ON" : "OFF").append("\n");
        sb.append("Wallhack: ").append(switchWallhack.isChecked() ? "ON" : "OFF").append("\n");
        sb.append("Speed: ").append(switchSpeedHack.isChecked() ? "ON" : "OFF").append("\n");
        sb.append("Anti-Ban: ").append(switchAntiBan.isChecked() ? "ON" : "OFF").append("\n");
        sb.append("No Recoil: ").append(switchNoRecoil.isChecked() ? "ON" : "OFF").append("\n");

        tvStatus.setText(sb.toString());
        Toast.makeText(this, "Activated!", Toast.LENGTH_SHORT).show();
    }
}
