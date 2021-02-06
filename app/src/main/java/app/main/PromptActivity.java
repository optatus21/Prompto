package app.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import app.prompt.Prompt;

public class PromptActivity extends AppCompatActivity {
    private Prompt prompt;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt);
    }
}
