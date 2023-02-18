package ru.arvalon.alltests;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FotoView {

    Button button;
    EditText edit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=findViewById(R.id.edit);
        button=findViewById(R.id.button);
        text=findViewById(R.id.text);
    }

    public void sayHello(View view) {
        String name = edit.getText().toString();
        text.setText("Hello, "+name);
    }

    @Override
    public void showError(Throwable t) {

    }

    @Override
    public void newData(String data) {

    }
}
