package com.example.lenovo.konversiwaktu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lenovo.konversiwaktu.R.id.JamM;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int req_code = 1;
    private Button b_JamM, b_JamD;
    private TextView tResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_JamM = findViewById(R.id.JamM);
        b_JamD = findViewById(R.id.JamD);

        b_JamM.setOnClickListener(this);
        b_JamD.setOnClickListener(this);

        tResult = findViewById(R.id.result);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.JamM:
                Intent cm = new Intent(this, Main2Activity.class);
                startActivityForResult(cm, req_code);
                break;

            case R.id.JamD:
                Intent m = new Intent(this, Main3Activity.class);
                startActivity(m);
                break;

        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent rtn) {
        if (requestCode == req_code){
            if (resultCode == RESULT_OK){
                tResult.setText(rtn.getData().toString());
            }
        }
    }
}
