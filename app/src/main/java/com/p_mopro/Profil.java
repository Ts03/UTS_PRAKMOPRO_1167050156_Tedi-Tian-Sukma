package com.p_mopro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Profil extends AppCompatActivity {

    private Button Facebook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        findViewById(R.id.FB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.facebook.com/tedi.scream?ref=bookmarks");
            }
        });

        Button btn = (Button)findViewById(R.id.dial);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:085797266730"));
                startActivity(intent);
            }
        });
    }

    public void clicked_btn(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void open(View view){
        Intent intent2 = new Intent();
        intent2.setAction(Intent.ACTION_VIEW);
        intent2.setData(Uri.parse("geo:-6.931766, 107.715363"));
        startActivity(intent2);
    }

    public void onDialButton(View view) {
    }
}
