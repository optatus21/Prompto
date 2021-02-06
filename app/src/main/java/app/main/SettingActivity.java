package app.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import app.setting.Setting;

public class SettingActivity extends AppCompatActivity {
    
    private Setting setting;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
}
